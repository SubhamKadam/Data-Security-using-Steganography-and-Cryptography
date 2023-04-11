package Cryptography;
import Data.DataWarehouse;

public class Encrypter {
    
    final static int key = 3;
    public static void ceaserCipher(DataWarehouse dataObj) {
        StringBuilder cipherText = new StringBuilder();
        // System.out.println(inputObj.getPlainText());
        for (char c : dataObj.getPlainText().toCharArray()) {
            if (Character.isLetter(c)) {
                char encryptedChar = (char)((( c - 'a' + key ) % 26) + 'a');
                cipherText.append(encryptedChar);
            }
            else {
                cipherText.append(c);
            }
        }
        dataObj.setCipherText(cipherText.toString());
    }
}
