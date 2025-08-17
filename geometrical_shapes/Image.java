package geometrical_shapes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image implements Displayable {    
    private final BufferedImage img;

    public Image(int w, int h) {
        this.img = new BufferedImage(w,h, BufferedImage.TYPE_INT_RGB);
    } 

    @Override
    public void display(int x, int y, Color color) {
        if (x >= 0 && x < img.getWidth() && y >= 0 && y < img.getHeight()) {
            img.setRGB(x, y, color.getRGB());
        }
    }

    @Override
    public void save(String fileName) {
        try {
            ImageIO.write(this.img, "png", new File(fileName));
        } catch (IOException e) {
            System.err.println("Error saving image: "+ e.getMessage());
        }
    }

    public int getWidth() {
        return img.getWidth();
    }

    public int getHeight() {
        return img.getHeight();
    }
}   


