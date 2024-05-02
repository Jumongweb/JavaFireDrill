package dietel_c15;

import java.io.*;

public class Stream4 {
    public static void main(String[] args) {
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\sample1.txt";
        try(FileOutputStream fileOutputStream
                    = new FileOutputStream(location, true)) {
            String data = "\nInvest your money wisely, Stop playing sporty bet";
            fileOutputStream.write(data.getBytes());
        } catch (IOException e){
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }
}

