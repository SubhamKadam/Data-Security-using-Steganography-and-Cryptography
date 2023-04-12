package Stegnography;

import java.awt.Color;
import java.awt.image.BufferedImage;


public class Extractor extends rulesOfStegnography{

    public static String extract(BufferedImage vesselImage) {
        StringBuilder headerText = new StringBuilder();
        StringBuilder extractText = new StringBuilder();
        int cnt = 0;
        int sizeOfExtraction = -1 ;
        for (int x = 0; x < vesselImage.getWidth(); x++) {
            for (int y = 0; y < vesselImage.getHeight(); y++) {
                int pixel = vesselImage.getRGB(x, y);
                int pixelData = extractFromPixel(pixel);
                if (cnt > (sizeOfExtraction + getHEADER_LENGTH()) && sizeOfExtraction != -1){
                    return headerText.toString() + extractText.toString();
                }else if (cnt < getHEADER_LENGTH()){
                    headerText.append( (char) pixelData);
                }else if (cnt == getHEADER_LENGTH()) {
                    sizeOfExtraction =  Integer.parseInt(headerText.toString().replaceAll("[^0-9]", ""));
                    extractText.append((char)pixelData); 
                }else if (cnt < sizeOfExtraction + getHEADER_LENGTH()){
                    extractText.append((char)pixelData);   
                }
                cnt++;
                System.out.println(cnt);
            }
        }
        return headerText.toString() + extractText.toString();
    }
    public static int extractFromPixel(int pixel) {
        Color color = new Color(pixel, true);
        // System.out.println(color);
        int rBits = extractBits(color.getRed(), 3);
        int gBits = extractBits(color.getGreen(), 3);
        int bBits = extractBits(color.getBlue(), 2);
        return mergeBits(rBits, gBits, bBits);
    }
    public static int extractBits(int num, int nbits) {
        return num&((1<<nbits) - 1);
    }
    public static int mergeBits(int r, int g, int b) {
        int num = ((r << 5) | (g << 2) | ( b ));
        return num;
    }
}