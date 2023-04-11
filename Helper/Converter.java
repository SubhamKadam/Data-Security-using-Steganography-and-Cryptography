package Helper;

import java.io.BufferedReader;
import Data.DataWarehouse;

public class Converter{

    public static void convertToString(DataWarehouse dataObj){
        BufferedReader reader = dataObj.getReader();
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        try {
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }    
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            reader.close();
        } catch (Exception e) {
            System.out.println("Issue with readline");
        }
        
        dataObj.setPlainText(stringBuilder.toString());        
    }
}