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

class Dequeue implements PalindromeStrategy{
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
        PalindromeStrategy check = new StackStrategy();
        boolean flag = check.palindromeChecker(text);
        System.out.println("Is it a palindrome? : "+flag);
        input.close();
    }
}



