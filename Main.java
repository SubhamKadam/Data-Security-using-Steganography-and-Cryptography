import java.io.IOException;
import java.util.Scanner;
import Helper.TakeInput;

public class Main {
    public static void main(String[] args) throws IOException{
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vessel image path: ");
        String vesselImagePath = scanner.nextLine();
        System.out.print("Enter the path of the .txt file: ");
        String documentPath = scanner.nextLine();
        scanner.close();
        TakeInput inputObj = new TakeInput(vesselImagePath, documentPath);
        inputObj.beginProcessing();
    /*  
        Scanner input = new Scanner(System.in);
        while (true) {
            //"E:/trash/answer.txt"
            System.out.println("1. Embed");
            System.out.println("2. Extract");
            System.out.println("3. Exit");
            System.out.println("Enter choice ");
            int choice = input.nextInt();
            
            if(choice == 1){
                System.out.println("Enter vessel image path");
                String vesselImage = input.nextLine();
                System.out.println("Enter file to embed")
                String document = input.nextLine();
                 
            }
            else if(choice == 3)
                break;
        }
        input.close(); E:/trash/answer.txt
    */
    }
}
