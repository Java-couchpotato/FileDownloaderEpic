package firstProject.epic.managing;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Resize implements Actionable {
    @Override
    public BufferedImage doAction(BufferedImage imageResize) {
        int width = imageResize.getWidth();
        int height = imageResize.getHeight();

        Graphics2D g2d = imageResize.createGraphics();
        g2d.drawImage(imageResize, 0, 0, width, height, null);
        g2d.dispose();

        return imageResize;
    }
}
