package dietel_c15;

import java.io.IOException;
import java.io.PrintStream;

public class Stream1 {
    public static void main(String[] args) {
        try(PrintStream printStream =
                    new PrintStream("C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\sample1.txt")){
                        printStream.println("There is a tide in the affairs of men");
        } catch (IOException e) {
                        System.err.println("Error: " + e.getMessage());
        }
    }
}
