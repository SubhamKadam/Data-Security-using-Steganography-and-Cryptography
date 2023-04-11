import Cryptography.Encrypter;
import Helper.*;
import Data.DataWarehouse;
public class Main {
    public static void main(String[] args){
        
        DataWarehouse dataObj = new DataWarehouse();
        InputHandler.takeInput(dataObj);
        Converter.convertToString(dataObj);
        Encrypter.ceaserCipher(dataObj);
    }
}
