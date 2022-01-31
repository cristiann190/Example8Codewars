package src;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    public static String spinWords(String sentence) {
        StringBuilder spinSentence = new StringBuilder();
        for (String word : sentence.split(" ")) {
            if (word.length() >= 5) {
                word = invertWord(word);
            }
            spinSentence.append(word).append(" ");
        }
        return spinSentence.toString().trim();
    }

    private static String invertWord(String word) {
        StringBuilder spinWord = new StringBuilder();
        for (int index = word.length() - 1; index >= 0; index--) {
            spinWord.append(word.charAt(index));
        }
        return spinWord.toString();
    }

//    -------------------- Optimized ----------------------
    public static String spinWordsOptimized(String sentence) {
        String[] words = sentence.split(" ");
        for (int i=0; i<words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }

    public String spinWordsOptimized2(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }
}