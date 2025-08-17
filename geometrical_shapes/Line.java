package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {
    Point p1,p2;
    Color color = getColor();

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line random(int w, int h) {
        return new Line(Point.random(w, h),Point.random(w, h));
    }

    @Override
    public void draw(Displayable image) {
        int x0 = p1.x; int y0 = p1.y;
        int x1 = p2.x; int y1 = p2.y;

        int dx = Math.abs(x1-x0);
        int stepX = (x0 < x1) ? 1 : -1;
        int dy = -Math.abs(y1-y0);
        int stepY = (y0 < y1) ? 1 : -1;

        int err = dx+dy;

        while (true) {
            image.display(x0, y0, color);

            if (x0 == x1 && y0 == y1) break;

            int e2 = 2*err;

            if (e2 >= dy) {err += dy; x0 += stepX; }
            if (e2 <= dx) {err += dx; y0 += stepY; }
        }
    }   
}