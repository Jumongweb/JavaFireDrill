package dietel_c15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Stream10 {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\textOne.txt");
        try{
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write("Happy Birthday, Bolaji");
            writer.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
