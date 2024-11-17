import java.util.Scanner; 
// Write a program that changes the word "hate" to "love" in a given line of text.
public class LoveHate{
    
    /**
     * This method changes the word "hate" to "love" in a given line of text.
     * @param s the line of text to be changed
     * @return the new line of text
     */
    public String HateCheck(String s){
        String w = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'a' && s.charAt(i + 2) == 't' && s.charAt(i + 3) == 'e'){
                w += "love";
                i += 3;
            } else {
                w += s.charAt(i);
            }
        }
        return w;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The line of text to be changed is: ");
        String s = sc.nextLine();
        LoveHate lh = new LoveHate();
        System.out.println("The new line of text is: ");
        System.out.println(lh.HateCheck(s));
        sc.close();
    }
}