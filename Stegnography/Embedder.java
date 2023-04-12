package Stegnography;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class Embedder extends rulesOfStegnography {
    public static BufferedImage embedd(BufferedImage vesselImage, String inputText, String headerText){
        int headerTextIndex = 0;
        int inputTextIndex = 0;
        int data;
        for (int x = 0; x < vesselImage.getWidth(); x++) {
            for (int y = 0; y < vesselImage.getHeight(); y++) {
                int pixel = vesselImage.getRGB(x, y);
                if (headerTextIndex < getHEADER_LENGTH()){
                    try {
                        data = headerText.charAt(headerTextIndex++);    
                    } catch (Exception e) {
                        data = '-';
                    }
                }else if (inputTextIndex < inputText.length()){
                    data = inputText.charAt(inputTextIndex++);    
                }else{
                    data = ' ';
                }
    
                Color color = new Color(pixel, true);
                int modifiedRed = (color.getRed() & 0b11111000) | (data>>5) & ((1<<3) - 1);
                int modifiedGreen = (color.getGreen() & 0b11111000) | (data>>2) & ((1<<3) - 1);
                int modifiedBlue = (color.getBlue() & 0b11111000) | (data) & ((1<<2) - 1);
                Color newColor = new Color(modifiedRed, modifiedGreen, modifiedBlue, color.getAlpha());
                vesselImage.setRGB(x, y, newColor.getRGB());

                if(inputTextIndex >= inputText.length()){
                    return vesselImage;
                }
            }
        }
        return vesselImage;
    }
}
