package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public static Circle random(int w, int h) {
        Random rand = new Random();
        Point center = Point.random(w, h);
        int r = rand.nextInt(h);
        return new Circle(center,r);
    }

    @Override
    public void draw(Displayable image) {
        int cx = this.center.x;
        int cy = this.center.y;
        int x = 0;
        int y = -this.radius;

        Color color = getColor();

        while (x < -y) {
            if (x*x + y*y > radius*radius) {
                y++;
            }

            image.display(cx + x, cy + y, color);
            image.display(cx - x, cy - y, color);
            image.display(cx + x, cy - y, color);
            image.display(cx - x, cy + y, color);
            image.display(cx + y, cy - x, color);
            image.display(cx - y, cy + x, color);
            image.display(cx - y, cy - x, color);
            image.display(cx + y, cy + x, color);

            x++;
        }
    } 
}