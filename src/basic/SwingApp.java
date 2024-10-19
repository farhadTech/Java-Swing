package basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("My First Swing App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel label = new JLabel("Hello, Swing!");

        // Create a text field for user input
        JTextField textField = new JTextField(10);
        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("I agree");

        // Create a button
        JButton button = new JButton("Click Me");

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                label.setText("Button Clicked!");
                if(checkBox.isSelected()) {
                    label.setText(textField.getText() + " (Agreed)");
                } else {
                    label.setText(textField.getText() + " (Not Agreed)");
                }
            }
        });
        // Add the label and button to the frame
        frame.add(label);
        frame.add(button);
        frame.add(checkBox);
        frame.add(button);

        // Set layout to FlowLayout to arrange components
        frame.setLayout(new FlowLayout());

        // Make the frame visible
        frame.setVisible(true);
    }
}
