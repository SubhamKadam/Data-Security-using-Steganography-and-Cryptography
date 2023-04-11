package Helper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;

import Cryptography.Encrypter;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;

public class TakeInput {
    
    BufferedImage vesselImage;
    String plainText;
    public TakeInput(String vesselImagePath, String documentPath) throws IOException {
        vesselImage = ImageIO.read(new File(vesselImagePath));
        loadDocument(documentPath);
        System.out.println(plainText);
    }
    private void loadDocument(String documentPath) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(documentPath));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();
        plainText = stringBuilder.toString();
    }
    //plaintext -> encryptText -> stegno
    public void beginProcessing() {
        Encrypter encrypterobj = new Encrypter(plainText);
        String cipherText = encrypterobj.ceaserCipher(3);
        System.out.println(cipherText);
        //make an object of embedder and call appropriate method by passing vesselImage and cipherText
    }
}
