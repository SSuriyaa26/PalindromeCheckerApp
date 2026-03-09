import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the palindrome Checker Management System \nVersion : 1.0\nSystem initialized sucessfully.");
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = input.nextLine();
        boolean flag = true;
        LinkedList<Character> list =new LinkedList<>();
        for(char c: text.toCharArray()){
            list.add(c);
        }
        while(list.size()>1){
            if(list.removeFirst()!=list.removeLast()){
                flag = false;
                break;
            }
        }
        System.out.println("Is it a palindrome? : "+flag);
        input.close();
    }
}


