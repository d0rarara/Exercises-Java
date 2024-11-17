// Program to calculate simple interest
public class SimpInt{
    /**
     * Method to calculate simple interest
     * @param p principal amount
     * @param r rate of interest
     * @param n number of years
     * @return simple interest
     */
    public double Simp(int p, double r, int n){
        double s = 0;
        s = (p*r*n) / 100;
        return s;
    } 
    
    public static void main(String[] args){
        int princi_amnt = 1000;
        double int_rate = 0.05;
        int no_of_yrs = 5;
        SimpInt s = new SimpInt();
        System.out.println(s.Simp(princi_amnt, int_rate, no_of_yrs));
    }
}