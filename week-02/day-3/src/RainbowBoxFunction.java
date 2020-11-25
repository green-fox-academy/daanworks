import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void fillSquare(Graphics graphics, int squareSize, int fillColorR, int fillColorG, int fillColorB) {
        graphics.setColor(new Color(fillColorR, fillColorG, fillColorB));
        graphics.fillRect(WIDTH / 2 - squareSize / 2, HEIGHT / 2 - squareSize / 2, squareSize, squareSize);
    }

    public static void FillWithSquares(Graphics graphics, int startSize) {

        // Fill the 'colors' array with the colors
        Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, new Color(75, 0, 130), new Color(127, 0, 255)};
        // Fill the screen with the colored squares
        for (int i = 0; i < colors.length; i++) {
            graphics.setColor(colors[i]);
            graphics.drawRect((WIDTH / 2 - startSize / 2) - 2 * i, (HEIGHT / 2 - startSize / 2) - 2 * i, startSize + 4 * i, startSize + 4 * i);
        }


    }

    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        FillWithSquares(graphics, 120);




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