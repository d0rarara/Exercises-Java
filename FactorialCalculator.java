//Implement a method that calculates the factorial of a number using both recursive and iterative approaches.
public class FactorialCalculator {
    public int factorial (int n){
        int res = 1;
        for (int i = 0; i < n; i++){
            res = res * (i + 1);
        }
        return res;
    }

    public int factorialRecursive(int n){
        if (n == 0){
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    
    public static void main(String[] args){
        FactorialCalculator fc = new FactorialCalculator();
        System.out.println(fc.factorial(5));
    }


}
