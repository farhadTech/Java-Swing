package basic;

import javax.swing.*;

public class DialogBoxes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog-Box");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Message Dialog
        JOptionPane.showMessageDialog(frame, "This is a message dialog");

        // Confirmation Dialog
        int response = JOptionPane.showConfirmDialog(frame, "Do you want to continue?");
        if(response == JOptionPane.YES_OPTION) {
            System.out.println("User chose Yes.");
        } else {
            System.out.println("User chose No or Cancel.");
        }

        // Input Dialog
        String name = JOptionPane.showInputDialog(frame, "Enter you name: ");
        System.out.println("User's name: " + name);
    }
}
