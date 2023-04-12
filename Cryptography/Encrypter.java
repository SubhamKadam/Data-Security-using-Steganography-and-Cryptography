package Cryptography;

public class Encrypter {
    
    final static int key = 3;
    public static String ceaserCipher(String input) {     
        StringBuilder cipherText = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char encryptedChar = (char)((( c - 'a' + key ) % 26) + 'a');
                cipherText.append(encryptedChar);
            }
            else {
                cipherText.append(c);
            }
        }
        return cipherText.toString();
    }
}
