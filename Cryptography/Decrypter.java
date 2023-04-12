package Cryptography;

public class Decrypter {
    final static int key = 3;
    public static String ceaserCipher(String  input) {
        StringBuilder planText = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int indexOfDecryptChar = (c - 'a' - key) % 26;
                if ( indexOfDecryptChar < 0){
                    indexOfDecryptChar += 26;
                }
                planText.append((char) (indexOfDecryptChar + 'a'));
            }
            else {
                planText.append(c);
            }
        }
        return planText.toString();
    }
}
