package ToDoList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListApp {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("To-Do List Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a text field for task input
        JTextField taskField = new JTextField(20);

        // Create an "Add Task" button
        JButton addButton = new JButton("Add Task");

        // Create a list to display tasks
        DefaultListModel<String> taskListModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(taskListModel);

        // Create a "Remove Task" button
        JButton removeButton = new JButton("Remove Task");

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));  // Vertical layout for buttons
        buttonPanel.add(addButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));  // Add some space between buttons
        buttonPanel.add(removeButton);

        // Add components to the main panel
        panel.add(taskField, BorderLayout.NORTH);
        panel.add(new JScrollPane(taskList), BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.EAST);  // Buttons on the right

        // Add functionality to the "Add Task" button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText();
                if (!task.isEmpty()) {
                    taskListModel.addElement(task);
                    taskField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Task cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add functionality to the "Remove Task" button
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedTaskIndex = taskList.getSelectedIndex();
                if (selectedTaskIndex != -1) {
                    taskListModel.remove(selectedTaskIndex);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a task to remove!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
