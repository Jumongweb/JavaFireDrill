package dietel_c15;

import java.util.ArrayList;
import java.util.List;

public class ReverseSentence {
    public static String getReversedSentence(String sentence) {
        return reverseSentence(mySplit(sentence));
    }

    public static List<String> mySplit(String sentence){
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            word.append(sentence.charAt(i));
            if (sentence.charAt(i) ==' ') {
                words.add(word.toString());
                word = new StringBuilder();
            }
            if (i == sentence.length() - 1) {
                words.add(word.toString() + " ");
            }
        }
        return words;
    }

    public static String reverseSentence(List<String> sentenceList) {
        StringBuilder sentence = new StringBuilder();
        for (int i = sentenceList.size() - 1; i >= 0; i--) {
            sentence.append(sentenceList.get(i));
        }
        return sentence.toString().strip();
    }


}