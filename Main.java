import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import Cryptography.*;
import Helper.*;
import Stegnography.*;
import Data.DataWarehouse;

public class Main {
    public static void main(String[] args){
        try {
            
            BufferedImage normalImage = ImageIO.read(new File("C:/Users/MAXRAGE/Downloads/Testing/input.png"));;
            BufferedImage resultImage = Embedder.embedd(normalImage,"successfully abcd","17status");;
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
