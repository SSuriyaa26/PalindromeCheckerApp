import java.util.*;

public class PalindromeCheckerApp {
    private static boolean check(String s, int start,int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)==s.charAt(end)){
            return check (s,start+1,end-1);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the palindrome Checker Management System \nVersion : 1.0\nSystem initialized sucessfully.");
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = input.nextLine();
        boolean flag = check(text,0,text.length()-1);
        System.out.println("Is it a palindrome? : "+flag);
        input.close();
    }
}


