import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

    public static void MakeBlackSquare(Graphics graphics, int x, int y) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x, y, (int)(WIDTH / 8), (int)(HEIGHT / 8));
    }

    public static void MakeWhiteSquare(Graphics graphics, int x, int y) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(x, y, (int)(WIDTH / 8), (int)(HEIGHT / 8));
    }

    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        if(WIDTH == HEIGHT) {

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((i % 2 == 0) && (j % 2 == 0)) {
                        MakeBlackSquare(graphics, j * (int)(WIDTH / 8), i * (int)(HEIGHT / 8));
                    }

                    if ((i % 2 == 1) && (j % 2 == 1)) {
                        MakeBlackSquare(graphics, j * (int)(WIDTH / 8), i * (int)(HEIGHT / 8));
                    }

                    if ((i % 2 == 0) && (j % 2 == 1)) {
                        MakeWhiteSquare(graphics, j * (int)(WIDTH / 8), i * (int)(HEIGHT / 8));
                    }

                    if ((i % 2 == 1) && (j % 2 == 0)) {
                        MakeWhiteSquare(graphics, j * (int)(WIDTH / 8), i * (int)(HEIGHT / 8));
                    }
                }
            }
        } else {
            System.out.println("Please add the same Width and Height value for the canvas!");
        }
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