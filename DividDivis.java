import java.util.Scanner;
public class DividDivis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        int quotient = n1/n2;
        int remainder = n1%n2;
        System.out.println("Dividend: " + n1);
        System.out.println("Divisor: " + n2);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        sc.close();

    }
}
