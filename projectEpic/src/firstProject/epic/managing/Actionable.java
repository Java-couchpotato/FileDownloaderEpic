package firstProject.epic.managing;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface Actionable {
    public BufferedImage doAction(BufferedImage image) throws IOException;
}
