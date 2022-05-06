package firstProject.epic.managing;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Grayscale implements Actionable {

    @Override
    public BufferedImage doAction(BufferedImage imageGrayScale) throws IOException {

            int width = imageGrayScale.getWidth();
            int height = imageGrayScale.getHeight();

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    Color color = new Color(imageGrayScale.getRGB(i, j));
                    int red = (int) (color.getRed() * 0.2126);
                    int green = (int) (color.getGreen() * 0.7152);
                    int blue = (int) (color.getBlue() * 0.2126);
                    int sum = red + green + blue;
                    Color greyscale = new Color(sum, sum, sum);
                    imageGrayScale.setRGB(j, i, greyscale.getRGB());

                    ImageIO.write(imageGrayScale,".jpg", new File("C:\\Users\\HP\\Desktop\\grayscale"));

                }

            }
        return imageGrayScale;
    }
}
