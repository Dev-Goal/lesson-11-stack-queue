package exercise.exercise_7;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input message: ");
        String message = scanner.nextLine();
        Stack<String> wStack = new Stack<>();
        String[] words = message.split(" ");
        for (String mWord : words) {
            wStack.push(mWord);
        }
        StringBuilder messageNew = new StringBuilder();
        while (!wStack.isEmpty()) {
            String mWord = wStack.pop();
            messageNew.append(mWord).append(" ");
        }
        String result = messageNew.toString().trim();
        System.out.println(result);
    }
}
