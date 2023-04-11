package Helper;

import java.io.BufferedReader;

public class Converter{

    public static void convertToString(TakeInput inputObj){
        BufferedReader reader = inputObj.reader;
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
        
        inputObj.plainText = stringBuilder.toString();        
    }
}