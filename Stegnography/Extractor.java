package Stegnography;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.*;

import javax.imageio.ImageIO;

public class Extractor {
    BufferedImage vesselImage;
    String targetFolder;
    String cipherText;
    final static int HEADER_LENGHT = 20;
    public Extractor(String vesselImagePath, String targetFolder) {
        try {
            vesselImage = ImageIO.read(new File(vesselImagePath)); 
        } catch (Exception e) {
            System.out.println("Failed to load vesselImage");
        }
        this.targetFolder = targetFolder;
        Path path = Paths.get(targetFolder);
        if (!Files.exists(path) || !Files.isDirectory(path)) {
            System.out.println("Incorrect folder path");
            return;
        }
    }

    public void extract() {
        StringBuilder header = new StringBuilder();
        StringBuilder dataBuilder = new StringBuilder();
        int cnt = 0;
        for (int x = 0; x < vesselImage.getWidth(); x++) {
            for (int y = 0; y < vesselImage.getHeight(); y++) {
                int pixel = vesselImage.getRGB(x, y);
                int pixelData = extractFromPixel(pixel);
        
                if (cnt < HEADER_LENGHT)
                    header.append((char)pixelData);
                else {
                    if (cnt == HEADER_LENGHT) {
                        //validate header
                        //know file name and extension
                    }
                    else {
                        dataBuilder.append((char)pixelData);
                    
                        if (cnt >= 100) {
                            break;
                        }    
                        // System.out.println(pixelData);
                    }
                }
                cnt++;
            }
        }
        this.cipherText = dataBuilder.toString();
        // System.out.println(this.cipherText);
    }
    public int extractFromPixel(int pixel) {
        Color color = new Color(pixel, true);
        // System.out.println(color);
        int rBits = extractBits(color.getRed(), 3);
        int gBits = extractBits(color.getGreen(), 3);
        int bBits = extractBits(color.getBlue(), 2);
        return mergeBits(rBits, gBits, bBits);
    }
    public int extractBits(int num, int nbits) {
        return num&((1<<nbits) - 1);
    }
    public int mergeBits(int r, int g, int b) {
        int num = (((r << 3) | g) << 2) | b;
        return num;
    }
    public String getCipherText() {
        return this.cipherText;
    }
}
