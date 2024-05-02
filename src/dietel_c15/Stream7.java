package dietel_c15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Stream7 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\sample1.txt";
        try(FileInputStream fileInputStream = new FileInputStream(fileLocation);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader)) {
            System.out.println(reader.lines().collect(Collectors.joining("\n")));
        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }

}
