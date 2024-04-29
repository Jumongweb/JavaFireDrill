package dietel_c15;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {
    public static void main(String[] args) {
        // TODO: java.io and java.nio
        // This are libraries for file handling

        //Paths
        //windows ====>  C:\\DELL\Desktop
        // unix ====> /home/usr/...
        //One
        try{
            String location = "C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\sample1.txt";
            //String location = "C:\\Users\\DELL\\filesHandling.txt";
            Path path = Paths.get(location); //Path.of(location);
            Files.createFile(path);
        }
        catch(IOException e){
            e.printStackTrace();
        }

        // check if file exist method


        // two
        /*try{
            String location = "C:\\Users\\DELL\\Documents\\programming _books";
            Path path = Paths.get(location);
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
            directoryStream.forEach(System.out::println);
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }*/

        // three does same thing with above
        /*String location = "C:\\Users\\DELL\\Documents\\programming _books";
        Path path = Paths.get(location);
        try(DirectoryStream<Path> directoryStream =
                    Files.newDirectoryStream(path)){
            directoryStream.forEach(System.out::println);
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }*/



    }
}
