package Stegno_Java;
import java.util.Scanner;

class Embedder {

}

class Extractor {

}

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true) {
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
        input.close();
    }
}
