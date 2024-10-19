package Registration_Form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("User Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create a panel to hold form elements
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));  // Padding

        // Create form fields with labels
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);

        JLabel genderLabel = new JLabel("Gender:");
        String[] genderOptions = {"Male", "Female", "Other"};
        JComboBox<String> genderBox = new JComboBox<>(genderOptions);

        JLabel termsLabel = new JLabel("Accept Terms:");
        JCheckBox termsCheckBox = new JCheckBox();

        JButton registerButton = new JButton("Register");
        JLabel messageLabel = new JLabel();  // For displaying messages

        // Create sub-panels to align fields and labels properly
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(nameLabel);
        namePanel.add(nameField);

        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        emailPanel.add(emailLabel);
        emailPanel.add(emailField);

        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(genderLabel);
        genderPanel.add(genderBox);

        JPanel termsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        termsPanel.add(termsLabel);
        termsPanel.add(termsCheckBox);

        // Add components to the main panel
        panel.add(namePanel);
        panel.add(emailPanel);
        panel.add(passwordPanel);
        panel.add(genderPanel);
        panel.add(termsPanel);
        panel.add(registerButton);
        panel.add(messageLabel);

        // Add functionality to the "Register" button
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String gender = (String) genderBox.getSelectedItem();

                // Validation
                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    messageLabel.setText("Please fill in all fields.");
                    messageLabel.setForeground(Color.RED);
                } else if (!termsCheckBox.isSelected()) {
                    messageLabel.setText("You must accept the terms.");
                    messageLabel.setForeground(Color.RED);
                } else {
                    messageLabel.setText("Registration successful!");
                    messageLabel.setForeground(Color.GREEN);

                    // Optionally, process the form data here (e.g., save to a database)
                    // Clear the form after registration
                    nameField.setText("");
                    emailField.setText("");
                    passwordField.setText("");
                    termsCheckBox.setSelected(false);
                }
            }
        });

        // Add the main panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
