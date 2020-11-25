import java.awt.*;

public class Shapes {
    public static void mainDraw(Graphics graphics){
        graphics.drawLine(0, 0, 200, 50);
        graphics.drawRect(50, 50, 100, 90);
        graphics.fillRect(60, 60, 100, 90);
        graphics.fillOval(120, 10, 180, 90);
    }
}
