import Cryptography.Encrypter;
import Helper.*;

public class Main {
    public static void main(String[] args){
        
       
        TakeInput inputObj = new TakeInput();
        Converter.convertToString(inputObj);
        Encrypter.ceaserCipher(inputObj);
        // Stegnography.Embedder();

    }
}
