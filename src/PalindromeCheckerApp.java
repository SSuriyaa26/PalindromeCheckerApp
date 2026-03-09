import java.util.*;
interface  PalindromeStrategy{
    boolean palindromeChecker(String s);
}
class StackStrategy implements PalindromeStrategy{
    public boolean palindromeChecker(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        for (int i = 0; i < s.length(); i++) {
            char popped = stack.pop();
            if (popped != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}

class DequeueStrategy implements PalindromeStrategy{
    public boolean palindromeChecker(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
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
public class PalindromeCheckerApp {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input text: ");
            String text = input.nextLine();

            PalindromeStrategy stackCheck = new StackStrategy();
        long startStack = System.nanoTime();
        boolean stackResult = stackCheck.palindromeChecker(text);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;

        PalindromeStrategy dequeCheck = new DequeueStrategy();
        long startDeque = System.nanoTime();
        boolean dequeResult = dequeCheck.palindromeChecker(text);
        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;

        System.out.println("StackStrategy result: " + stackResult + " (time: " + stackTime + " ns)");
        System.out.println("DequeueStrategy result: " + dequeResult + " (time: " + dequeTime + " ns)");


        input.close();
    }
}



