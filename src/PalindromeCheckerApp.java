import java.util.*;

public class PalindromeCheckerApp {
    static class PalindromeService{
        public boolean checker(String s){
            int start =0;
            int end = s.length()-1;

            while(start<end){

                if(s.charAt(start)!= s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }

            return true;

        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the palindrome Checker Management System \nVersion : 1.0\nSystem initialized sucessfully.");
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = input.nextLine();

        PalindromeService check = new PalindromeService();
        boolean flag = check.checker(text);
        System.out.println("Is it a palindrome? : "+flag);
        input.close();
    }
}



