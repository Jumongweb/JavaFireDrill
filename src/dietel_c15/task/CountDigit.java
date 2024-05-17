package dietel_c15.task;

import java.io.*;
import java.util.StringTokenizer;

public class CountDigit {

    public static int countDigit(String location) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(location));
        String sentence = bufferedReader.readLine();
//        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        int count = 0;
        for (char character = 0; character < sentence.length(); character++){
                if (String.valueOf(sentence.charAt(character)).matches("\\d")){
                    count++;
            }
        }

        return count;
    }

    public static int countSentence(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String content = reader.readLine();
        int count = 0;

        StringTokenizer st = new StringTokenizer(content);
        System.out.println(st.countTokens());
        System.out.println("St");
        for (int letter = 0; letter < content.length(); letter++) {
            if (content.charAt(letter) == '.' && (!String.valueOf(content).matches("^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?$"))){
                count++;
            }
        }
        return count;
    }


}
