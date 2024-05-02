package dietel_c15;

import java.io.FileReader;
import java.io.IOException;

public class Stream5 {
    public static void main(String[] args) {
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\sample1.txt";
        char[] fileChars = new char[1024];
        try(FileReader fileReader = new FileReader(location)){
            int numberOfCharactersRead = fileReader.read(fileChars);
            displayFileContent(numberOfCharactersRead, fileChars);
            fileReader.read();
        } catch (IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    private static void displayFileContent(int numberOfCharactersRead, char[] fileChars) {
        for (int counter = 0; counter < numberOfCharactersRead; counter++){
            System.out.print(fileChars[counter]);
        }
    }
}
