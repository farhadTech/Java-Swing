package basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panels {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing with JPanel");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Hello, Swing with JPanel");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Submit");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("You entered" + textField.getText()) ;
            }
        });

        panel.add(textField);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(label, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
