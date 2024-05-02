package dietel_c15;

import java.io.IOException;
import java.io.PrintStream;

public class Stream2 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\sample1.txt";
        try(PrintStream printStream = new PrintStream(fileLocation)){
            System.setOut(printStream);
            System.out.println("Hello World");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
