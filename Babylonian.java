import java.util.Scanner;
// The Babylonian algorithm to find the square root of a number n is as follows:
// 1. Make a guess at the answer (you can pick n/2 as your initial guess).
// 2. Compute r = n / guess
// 3. Set guess = (guess + r) / 2
// 4. Go back to step 2 for as many iterations as necessary. The more iterations, the closer the approximation.
// Write a program that inputs a double for n, iterates through the Babylonian algorithm 5 times, and outputs the answer as a double to two decimal places.
// Your answer should be within 0.0001 of the actual square root.
public class Babylonian {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the square root of: ");
        double num = sc.nextDouble();
        double guess = num / 2;
        double r = num / guess;
        guess = (guess + r) / 2;
        while (Math.abs(guess * guess - num) > 0.0001) {
            r = num / guess;
            guess = (guess + r) / 2;
        }
        System.out.println("The square root of " + num + " is approximately " + guess);
        sc.close();
        


    }
}
