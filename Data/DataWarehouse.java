package Data;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;

public class DataWarehouse {
    private String documentPath;
    private String vesselImagePath;
    private BufferedImage vesselImage;
    private String plainText;
    private String cipherText;
    private BufferedReader reader;

    public String getDocumentPath() {
        return documentPath;
    }
    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }
    public String getVesselImagePath() {
        return vesselImagePath;
    }
    public void setVesselImagePath(String vesselImagePath) {
        this.vesselImagePath = vesselImagePath;
    }
    public BufferedImage getVesselImage() {
        return vesselImage;
    }
    public void setVesselImage(BufferedImage vesselImage) {
        this.vesselImage = vesselImage;
    }
    public String getPlainText() {
        return plainText;
    }
    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }
    public String getCipherText() {
        return cipherText;
    }
    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }
    public BufferedReader getReader() {
        return reader;
    }
    public void setReader(BufferedReader reader) {
        this.reader = reader;
    }
}
