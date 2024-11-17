// Write a program that calculates the number of milligrams of caffeine in a number of drinks.
//Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.
// A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup of coffee has approximately 160 mg of caffeine.
public class Caffeine{
    
    public static final int COFFEE = 160;
    public static final int COLA = 34;

    public static void main(String[] args){
        int lethalDose = 10000;
        int drink1 = 0;
        int drink2 = 0;
        int totalCaffeine = 0;
        
        while(totalCaffeine < lethalDose){
            totalCaffeine += COFFEE;
            drink1++;
        }
        totalCaffeine = 0;
        while(totalCaffeine < lethalDose){
            totalCaffeine += COLA;
            drink2++;
        }
        System.out.println("It takes " + drink1 + " cups of coffee to kill a person and it takes " + drink2 + " cans of cola to kill a person.");
    }
}

