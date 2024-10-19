package basic;

import javax.swing.*;
import java.awt.*;

class MyCustomComponents extends JComponent {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.BLACK);
        g.drawString("Custom Drawing", 70, 180);
    }
}

public class CustomComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom drawing");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new MyCustomComponents());
        frame.setVisible(true);
    }
}
