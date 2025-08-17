package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    Point p1,p3;

    public Rectangle(Point p1, Point p3) {
        this.p1 = p1;
        this.p3 = p3;
    }

    @Override
    public void draw(Displayable image) {
        Point p2 = new Point(this.p3.x,this.p1.y);
        Point p4 = new Point(this.p1.x,this.p3.y);
        Line l1 = new Line(this.p1,p2);
        Line l2 = new Line(p2,this.p3);
        Line l3 = new Line(this.p3,p4);
        Line l4 = new Line(this.p1,p4);
        Color color = getColor();
        l1.color = color;
        l2.color = color;
        l3.color = color;
        l4.color = color;
        l1.draw(image);
        l2.draw(image);
        l3.draw(image);
        l4.draw(image);
    }
}