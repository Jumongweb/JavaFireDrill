package dietel_c15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example3 {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\DELL\\Documents\\programming _books\\hfoad");
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
            path.forEach(p -> {if(Files.isDirectory(p)) System.out.println(p);});
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
