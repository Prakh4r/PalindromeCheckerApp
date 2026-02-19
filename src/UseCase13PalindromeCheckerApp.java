import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Level";

        // Compare Stack Strategy
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;

        // Compare Deque Strategy
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;

        System.out.println("Input : " + input);
        System.out.println("Stack Result : " + stackResult);
        System.out.println("Stack Time : " + stackTime + " ns");

        System.out.println();

        System.out.println("Deque Result : " + dequeResult);
        System.out.println("Deque Time : " + dequeTime + " ns");
    }

    // Stack-based algorithm
    public static boolean stackPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toLowerCase().toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toLowerCase().toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque-based algorithm
    public static boolean dequePalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toLowerCase().toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}
