package dietel_c15;

import java.io.InputStream;
import java.net.URL;

public class WebScraper {
    public static void main(String[] args) {


        try{
//            String location = "https://www.google.com";
            String location = "https://www.google.com";
            URL url = new URL(location);
            InputStream inputStream = url.openStream();
            byte[] bytes = inputStream.readAllBytes();

            for (byte data : bytes){
                System.out.print(Character.toString(data));
            }
        } catch (Exception e){
            System.err.print("Error " + e.getMessage());
            e.printStackTrace();
        }
    }
}
