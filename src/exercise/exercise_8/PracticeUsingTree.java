package exercise.exercise_8;

import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class PracticeUsingTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input message: ");
        String message = scanner.nextLine();
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        StringTokenizer tokenizer = new StringTokenizer(message, " ");
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
