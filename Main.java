import java.util.Scanner;
import Cryptography.Encrypter;
import Helper.*;
import Stegnography.Extractor;
import Data.DataWarehouse;

public class Main {
    public static void main(String[] args){
        
        // DataWarehouse dataObj = new DataWarehouse();
        // InputHandler.takeInput(dataObj);
        // Converter.convertToString(dataObj);
        // Encrypter.ceaserCipher(dataObj);
        
        
        //Embedder work - Ajay will implement

        //Defining temp function for dealing with extractor(not good implementation)
        chotaMain();
    }
    public static void chotaMain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter embedded image path: ");
        String vesselImagePath = scanner.nextLine();
        System.out.print("Enter target folder path: ");
        String targetFolder = scanner.nextLine();
        scanner.close();
        Extractor extractor = new Extractor(vesselImagePath, targetFolder);
        extractor.extract();
        // Decrypter.ceaserCipherDecrypt();
    } 
}
