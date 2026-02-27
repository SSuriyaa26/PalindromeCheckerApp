import java.util.Scanner;
public class PalindromeCheckerApp {
   public static void main(String[] args) {
       System.out.println("Welcome to the palindrome Checker Management System \nVersion : 1.0\nSystem initialized sucessfully.");
       Scanner input = new Scanner(System.in);
       System.out.print("Input text: ");
       String text=input.nextLine();
       boolean flag=true;
       String comptext="";
       for(int i =text.length()-1;i>=0;i--){
           comptext += text.charAt(i);
       }
        for(int i=0;i<text.length();i++){
            if (comptext.charAt(i)==text.charAt(i)){
                continue;
            }
            else{
                flag = false;
            }
        }
        System.out.println("Is it a  palindrome? : "+flag);
   }

}


