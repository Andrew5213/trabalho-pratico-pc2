package paint_AndrewOficial.View.desenhos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

public class Draw_A_Triangle extends JPanel {
    public void paintComponent(Graphics g) {
        Triangle_Shape triangleShape = new Triangle_Shape(new Point2D.Double(50, 0),
                new Point2D.Double(100, 100), new Point2D.Double(0, 100));
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.draw(triangleShape);
    }

}
class Triangle_Shape extends Path2D.Double {
    public Triangle_Shape(Point2D... points) {
        moveTo(points[0].getX(), points[0].getY());
        lineTo(points[1].getX(), points[1].getY());
        lineTo(points[2].getX(), points[2].getY());
        closePath();
    }
}