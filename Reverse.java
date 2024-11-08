// Write a program that reads a string and prints the reverse of the string.
import java.util.Scanner; 
public class Reverse {
    public static void main(String[] arga){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = sc.nextLine();
        String reverse = "";
        for(int i = input.length() - 1; i >= 0; i--){
            reverse += input.charAt(i);
        }
        System.out.println("Reverse: " + reverse);


    }
}
