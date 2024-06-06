import java.util.Scanner;
import java.util.Stack;

public class ReversesString04 {

    public String reverseSentence(String sentence) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reversed = new StringBuilder();

        for (char c : sentence.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Sentence: ");
        String sentence = scanner.nextLine();

        ReversesString04 reverse = new ReversesString04();
        String reversedSentence = reverse.reverseSentence(sentence);

        System.out.println("Result:");
        System.out.println(reversedSentence);

        scanner.close();
    }
}
