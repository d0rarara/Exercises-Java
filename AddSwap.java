// Implement a class that has two methods: one that adds two numbers and returns the result, and another that swaps the values of two numbers.
import java.util.Arrays;
import java.util.Scanner;
public class AddSwap{
    public int add(int n, int m){
        int sum = 0;
        sum = n + m;
        return sum;
    }

    public int[] swap(int n, int m){
        int[] swap = new int[2];
        swap[0] = m;
        swap[1] = n;
        return swap;
        
    }

    public static void main(String[] args){
        AddSwap ad = new AddSwap();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int in1 = sc.nextInt();
        int in2 = sc. nextInt();
        System.out.println(ad.add(in1,in2));

        System.out.println("Now we will swap the numbers.");
        System.out.println(Arrays.toString(ad.swap(in1,in2)));

        System.out.println();
        System.out.println("End of program. Goodbye.");

        sc.close();

    }
}