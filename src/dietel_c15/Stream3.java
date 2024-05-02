package dietel_c15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Stream3 {
    public static void main(String[] args) {
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\sample1.txt";
        try(InputStream inputStream = new FileInputStream(location);
            var dataInputStream = new DataInputStream(inputStream)){
            byte[] fileData = dataInputStream.readAllBytes();
            System.out.println(new String(fileData));
        } catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
