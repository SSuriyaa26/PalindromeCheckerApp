import java.util.Scanner;
public class PalindromeCheckerApp {
   public static void main(String[] args) {
       System.out.println("Welcome to the palindrome Checker Management System \nVersion : 1.0\nSystem initialized sucessfully.");
       Scanner input = new Scanner(System.in);
       System.out.print("Input text: ");
       String text=input.nextLine();
       boolean flag=true;
       char[] chars = text.toCharArray();
       int start =0;
       int end = chars.length -1;

       while (start<end){
           if(chars[start]!=chars[end]){
               flag =false;
               break;
           }
            start++;
           end--;
       }
       System.out.println("Is it a palindrome? : "+ flag);
   }

}


