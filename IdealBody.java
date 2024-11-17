import java.util.Scanner;
// This program calculates the ideal body weight of a person based on their height.
// The formula is as follows:
// 110 pounds for the first 5 feet, then 5 pounds for each additional inch.
public class IdealBody{
    public void weight(int feet, int inches){
        int pounds = 110;
        if (feet > 5) {
            pounds += (feet - 5) * 60;
        }
        pounds += inches * 5;
        System.out.println("Your ideal body weight is: " + pounds + " pounds. Good luck! :)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your height.");
        System.out.println("Feet: ");
        int feet = sc.nextInt();
        System.out.println("Inches: ");
        int inches = sc.nextInt();
        IdealBody idealb = new IdealBody();
        idealb.weight(feet, inches);
        sc.close();
    }
}