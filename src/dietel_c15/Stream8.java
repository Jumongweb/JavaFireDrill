package dietel_c15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Stream8 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\sample1.txt";
        try(InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(inputStreamReader)) {
            String data = reader.readLine();
            System.out.println("You entered: " + data);

        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
