package Helper;
import java.io.File;
import java.io.FileReader;
import javax.imageio.ImageIO;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;

public class TakeInput {
    
    BufferedImage vesselImage;
    String plainText;
    String cipherText;
    BufferedReader reader;
    public TakeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vessel image path: ");
        String vesselImagePath = scanner.nextLine();
        System.out.print("Enter the path of the .txt file: ");
        String documentPath = scanner.nextLine();
        scanner.close();
        try {
            vesselImage = ImageIO.read(new File(vesselImagePath));
        } catch (Exception e) {
            System.out.println("Failed to load vessel image");
        }
        try {
            reader = new BufferedReader(new FileReader(documentPath));
        } catch (Exception e) {
            System.out.println("Failed to load document");
        }
        
    }
    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }
    public String getPlainText() {
        return plainText;
    }
}
