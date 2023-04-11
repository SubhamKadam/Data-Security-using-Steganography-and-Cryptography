package Cryptography;

import Helper.TakeInput;

public class Encrypter {
    String plainText;
    final static int key = 3;
    public Encrypter(String plainText) {
        this.plainText = plainText;
    }
    public static void ceaserCipher(TakeInput inputObj) {
        StringBuilder cipherText = new StringBuilder();
        // System.out.println(inputObj.getPlainText());
        for (char c : inputObj.getPlainText().toCharArray()) {
            if (Character.isLetter(c)) {
                char encryptedChar = (char)((( c - 'a' + key ) % 26) + 'a');
                cipherText.append(encryptedChar);
            }
            else {
                cipherText.append(c);
            }
        }
        inputObj.setCipherText(cipherText.toString());
        System.out.println(cipherText.toString());
    }
}
