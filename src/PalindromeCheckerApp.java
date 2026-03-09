import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the palindrome Checker Management System \nVersion : 1.0\nSystem initialized sucessfully.");
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = input.nextLine();
        boolean flag = true;
        String noSpaces = text.replaceAll("\\s", "");
        String normalized = noSpaces.toLowerCase();

        for(int i=0;i<normalized.length()/2;i++)     {
         if(normalized.charAt(i)!=normalized.charAt(normalized.length()-1-i)){
            flag=false; }}
        System.out.println("Is it a palindrome? : "+flag);
        input.close();
    }
}



