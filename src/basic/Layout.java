package basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("BorderLayout");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel label = new JLabel("BorderLayout");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Submit");
        JCheckBox checkBox = new JCheckBox("I Agree");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(checkBox.isSelected()) {
                    label.setText(textField.getText() + " (Agreed)");
                }
                else {
                    label.setText(textField.getText() + "(Not Agreed)");
                }
            }
        });

        frame.setLayout(new BorderLayout());

        frame.add(label, BorderLayout.NORTH);;
        frame.add(textField, BorderLayout.CENTER);
        frame.add(checkBox, BorderLayout.WEST);
        frame.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
