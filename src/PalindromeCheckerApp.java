import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the palindrome Checker Management System \nVersion : 1.0\nSystem initialized sucessfully.");
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = input.nextLine();
        boolean flag = true;
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        for (char c : text.toCharArray()) {
            if (c != stack.pop()) {
                flag = false;
                break;

            }
        }
        System.out.println("Is it a palindrome? : "+flag);

    }
}


