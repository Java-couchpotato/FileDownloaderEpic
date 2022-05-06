package firstProject.epic.managing;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ActoinsFactory {


    public void useAction(Actionable action) throws IOException {
        BufferedImage image = ImageIO.read(new File("D:\\java\\projectEpic\\src\\images\\image.jpg"));

            action.doAction(image);

        ImageIO.write(image,"png",new File("D:\\java\\projectEpic\\src\\images\\newimage.jpg"));

    }
}
