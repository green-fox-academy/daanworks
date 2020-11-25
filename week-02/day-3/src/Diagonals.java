import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void mainDraw(Graphics graphics) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.
        int[] line1point1XY = {0, 0};
        int[] line1point2XY = {WIDTH, HEIGHT};
        int[] line2point1XY = {0, HEIGHT};
        int[] line2point2XY = {WIDTH, 0};

        if (line1point1XY[0] == 0 && line1point1XY[1] == 0) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(line1point1XY[0],line1point1XY[1],line1point2XY[0],line1point2XY[1]);
        }

        graphics.setColor(Color.RED);
        graphics.drawLine(line2point1XY[0],line2point1XY[1],line2point2XY[0],line2point2XY[1]);

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