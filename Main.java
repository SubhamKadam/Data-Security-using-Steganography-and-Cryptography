import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import Helper.Validator;
import Stegnography.*;

public class Main {
    public static void main(String[] args){
        try {
            String inputText = "successfully abcd";
            
            BufferedImage normalImage = ImageIO.read(new File("C:/Users/MAXRAGE/Downloads/Testing/input.png"));
            boolean embedding_possible = Validator.validate(normalImage, inputText);
            if (!embedding_possible) {
                System.out.println("data to large for the image");
            }
            BufferedImage resultImage = Embedder.embedd(normalImage, inputText,"17status");

            // try {
            String extractedText = Extractor.extract(resultImage);
            // } catch (Exception e) {
            //     System.out.println("Failed 3");
            //     return;
            // }
            // String extractedText = "";
            try {
                System.out.println(extractedText);
            } catch (Exception e) {
                System.out.println("Failed 4");
                return;
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
       
        
    }
}
