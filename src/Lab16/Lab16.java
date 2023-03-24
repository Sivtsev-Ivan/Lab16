package Lab16;

import java.awt.*;
import javax.swing.*;

public class Lab16 extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw");
        Canvas draw = new Lab16();
        draw.setSize(450, 350);
        frame.add(draw);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(25, 175, 125, 75);
        g.drawLine(225, 175, 125, 75);

        g.drawLine(50, 150, 200, 150);
        g.drawLine(50, 150, 50, 300);
        g.drawLine(200, 300, 200, 150);

        g.drawLine(150, 100, 150, 75);
        g.drawLine(175, 125, 175, 75);
        g.drawLine(150, 75, 175, 75);

        g.drawLine(75, 200, 125, 200);
        g.drawLine(75, 200, 75, 250);
        g.drawLine(125, 250, 125, 200);
        g.drawLine(125, 250, 75, 250);

        g.drawLine(25, 300, 425, 300);

        g.drawArc(275, 50, 150, 200, 280,338);
        g.drawLine(335, 300, 335, 250);
        g.drawLine(365, 300, 365, 250);
    }
}
