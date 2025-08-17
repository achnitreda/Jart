package geometrical_shapes;

import java.util.Random;

public class Point implements Drawable {
    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y; 
    }

    public static Point random(int w, int h) {
        Random rand = new Random();
        int x = rand.nextInt(w);
        int y = rand.nextInt(h);
        return new Point(x,y);
    }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, getColor());
    }
}