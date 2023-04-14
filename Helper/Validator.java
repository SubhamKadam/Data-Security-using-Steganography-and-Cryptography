package Helper;
import Stegnography.rulesOfStegnography;
import java.awt.image.BufferedImage;

public class Validator {
    public static boolean validate(BufferedImage normalImage, String inputText) {
        int capacity = (normalImage.getWidth() * normalImage.getHeight()) - rulesOfStegnography.getHEADER_LENGTH();
        if (capacity < inputText.length())
            return false;
        return true;
    }
}
