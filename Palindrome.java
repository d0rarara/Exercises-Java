// Write a program that checks if a word is a palindrome. A palindrome is a word that is the same when read forwards and backwards. For example, "level" is a palindrome.
import java.util.Scanner;
public class Palindrome{
    public void isPalindrome(String n){
        String w = "";
        for(int i = n.length() - 1; i >=0; i--){
            w += n.charAt(i);
        }
        if (w.equals(n)) {
            System.out.println("This is a palindrome. ");
        } else {
            System.out.println("This is not a palindrome. ");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word and I'll tell you if it's a palindrome. BEEP BOOP.");
        String input = sc.nextLine();
        Palindrome fc = new Palindrome();
        fc.isPalindrome(input);
        sc.close();
    }
}