package Helper;
import java.io.File;
import java.io.FileReader;
import javax.imageio.ImageIO;
import java.util.Scanner;
import java.io.BufferedReader;
import Data.DataWarehouse;
public class InputHandler {
    
    public  static void  takeInput(DataWarehouse dataObj){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vessel image path: ");
        dataObj.setVesselImagePath(scanner.nextLine());
        System.out.print("Enter the path of the .txt file: ");
        dataObj.setDocumentPath(scanner.nextLine());
        scanner.close();
        try {
            dataObj.setVesselImage(ImageIO.read(new File(dataObj.getVesselImagePath())));
        } catch (Exception e) {
            System.out.println("Failed to load vessel image");
        }
        try {
            dataObj.setReader(new BufferedReader(new FileReader(dataObj.getDocumentPath())));
        } catch (Exception e) {
            System.out.println("Failed to load document");
        }
        
    }
}
