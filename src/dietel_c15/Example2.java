package dietel_c15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example2{
    public static void main(String[] args) {
        try{
            Path path = Path.of("C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\sample1.txt");
            Files.deleteIfExists(path);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
