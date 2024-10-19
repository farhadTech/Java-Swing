package basic;

import javax.swing.*;

public class TabbedPanes {
    public static void main(String[] args) {
        // create a new JFrame
        JFrame frame = new JFrame("Swing app with tabs");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // create panels to add to tabs
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Tab 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Tab 2"));

        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}

