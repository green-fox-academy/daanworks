import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void DrawEnvelope (Graphics graphics, int scale) {
        graphics.setColor(Color.GREEN);

        for (int i = 1; i < scale / 2; i++) {
            graphics.drawLine(WIDTH / 2, i * HEIGHT / scale, (WIDTH / 2) + (i * WIDTH / scale), HEIGHT / 2);
        }

        for (int i = 1; i < scale / 2; i++) {
            graphics.drawLine(WIDTH / 2, i * HEIGHT / scale, (WIDTH / 2) - (i * WIDTH / scale), HEIGHT / 2);
        }

        for (int i = 0; i < scale / 2; i++) {
            graphics.drawLine(i * WIDTH / scale, HEIGHT / 2, WIDTH / 2, (HEIGHT / 2) + (i * HEIGHT / scale));
        }

        for (int i = 0; i < scale / 2; i++) {
            graphics.drawLine(WIDTH - (i * WIDTH / scale), HEIGHT / 2, WIDTH / 2, (HEIGHT / 2) + (i * HEIGHT / scale));
        }
    }


    public static void mainDraw(Graphics graphics) {

        DrawEnvelope(graphics, 40);

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