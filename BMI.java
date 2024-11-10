// Implement a class BMI with the following methods:
import java.util.Scanner;
public class BMI{
    public String bmi(int a, double b){
        double r = 0;
        double height = b * b;
        r = a / height;
        return "Your BMI is: " + r;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kg: ");
        int w = sc.nextInt();
        System.out.println("Enter height in m: ");
        double m = sc.nextDouble();
        BMI b = new BMI();
        System.out.println(b.bmi(w,m));
        sc.close();

    }
}