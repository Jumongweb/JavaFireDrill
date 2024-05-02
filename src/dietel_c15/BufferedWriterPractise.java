package dietel_c15;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterPractise {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\output.txt", true));
//            writer.write("Hello World, my first personal java stream");
            writer.write("\n This should be appended to my file and it should be on a new line");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}
