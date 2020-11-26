import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

    public static void MakePurpleSteps3s(Graphics graphics, int startSize, int howManyTimes) {

        int x = startSize;
        int y = startSize;
        int newWidth = startSize;
        int newHeight = startSize;

        for (int i = 0; i < howManyTimes; i++) {
            graphics.setColor(new Color(238,130,238));
            graphics.fillRect(x, y, newWidth, newHeight);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(x, y, newWidth, newHeight);

            x = x + newWidth;
            y = y + newHeight;
            newWidth = newWidth + startSize;
            newHeight = newHeight + startSize;
        }
    }

    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

        MakePurpleSteps3s(graphics, 17, 3);


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}