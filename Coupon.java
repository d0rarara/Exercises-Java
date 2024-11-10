import java.util.Scanner;
// Implement a class Coupon with the following methods:
public class Coupon{
    // 10 coupons -> candy bar 
    // 3 coupons -> gumball
    
    /**
     * The prize method calculates the number of candy bars and gumballs
     * that can be redeemed with a given number of coupons.
     *
     * @param c The number of coupons.
     * @return A string indicating the number of candy bars and gumballs
     * that can be redeemed.
     */
    public String prize(int c){
        int count_c = 0;
        int count_g = 0;
        for (int i = 0; i < c; i++){
            if (c >= 10){
                count_c = c / 10;
                c = c % 10;
            }
            else if (c >= 3){
                count_g = c / 3;
                c = c % 3;
            }
        } 
        return "You can get " + count_c + " candy bar(s) and " + count_g + " gumball(s)."; 
    }

    /**
     * The main method serves as the entry point for the program.
     * It prompts the user to input the number of coupons they have won,
     * creates an instance of the Coupon class, and prints the prize
     * corresponding to the number of coupons.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String args[]){

        // Define a variable intially assigned to the number of coupons you win
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey! How many coupons did you win? ");
        int c = sc.nextInt();
        Coupon p = new Coupon();
        System.out.println(p.prize(c));
        sc.close();
    }
    
}