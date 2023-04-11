package Cryptography;

public class Encrypter {
    String plainText;
    public Encrypter(String plainText) {
        this.plainText = plainText;
    }
    public String ceaserCipher(int key) {
        StringBuilder cipherText = new StringBuilder();
        for (char c : plainText.toCharArray()) {
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
