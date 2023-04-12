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
    private int headerLength;
    private String encryptionTechnique;
    private int noOfPixelNeeded;
    private String headerText;
    private String outputPath;

    public int getNoOfPixelNeeded() {
        return noOfPixelNeeded;
    }
    public void setNoOfPixelNeeded(int noOfPixelNeeded) {
        this.noOfPixelNeeded = noOfPixelNeeded;
    }
    public String getOutputPath() {
        return outputPath;
    }
    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }
    public String getHeaderText() {
        return headerText;
    }
    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }
    public String getEncryptionTechnique() {
        return encryptionTechnique;
    }
    public void setEncryptionTechnique(String encryptionTechnique) {
        this.encryptionTechnique = encryptionTechnique;
    }
    public int getHeaderLength() {
        this.headerLength = getHeaderText().length();
        return getHeaderText().length();
    }
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
