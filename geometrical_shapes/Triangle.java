package geometrical_shapes;

import java.awt.Color;

public class Triangle implements Drawable {
    Point p1,p2,p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override 
    public void draw(Displayable image) {
        Color color = getColor();
        Line l1 = new Line(this.p1, this.p2);
        Line l2 = new Line(this.p2, this.p3);
        Line l3 = new Line(this.p1, this.p3);
        l1.color = color;
        l2.color = color;
        l3.color = color;
        l1.draw(image);
        l2.draw(image);
        l3.draw(image);
    }
}