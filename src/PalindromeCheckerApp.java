import java.util.Scanner;
public class PalindromeCheckerApp {
    void main(String[] args) {
        System.out.println("Welcome to the palindrome Checker Management System \nVersion : 1.0\nSystem initialized sucessfully.");
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String text=input.nextLine();
        boolean flag=true;
        for (int i=0;i<=text.length()/2;i++){
            if(text.charAt(i)==text.charAt(text.length()-i-1)){
                continue;

            }
            else{
                flag=false;
                break;
            }
        }

            System.out.println("Is it a Palindrome? : "+flag);


    }

}
