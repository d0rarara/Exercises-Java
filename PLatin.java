import java.util.Scanner;
public class PLatin{

    public String pLatin(String first, String last){
        String pLatin = "";
        String firstLower = first.toLowerCase();
        String lastLower = last.toLowerCase();
        String firstPLatin = Character.toUpperCase(firstLower.charAt(1)) + firstLower.substring(2) + firstLower.charAt(0) + "ay";
        String lastPLatin = Character.toUpperCase(lastLower.charAt(1)) + lastLower.substring(2) + lastLower.charAt(0) + "ay";
        pLatin = firstPLatin + " " + lastPLatin;
        return pLatin;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first = sc.nextLine();
        System.out.println("Enter your last name: ");
        String last = sc.nextLine();
        PLatin p = new PLatin();
        System.out.println(p.pLatin(first, last));
        sc.close();
    }
    

    
}