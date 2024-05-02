package dietel_c15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderPractise {
    public static void main(String[] args) {
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\output.txt";
        try{
            BufferedReader reader = new BufferedReader(new FileReader(location));
            reader.readLine();
            reader.close();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
