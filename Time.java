// Write a program that takes an integer t, which represents a time in seconds, and converts it to hours, minutes, and seconds. The program should output the time in the following format: Hours: hh Minutes: mm Seconds: ss
public class Time{
    public static void main(String[] args){
        int t = 50391;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        while (t > 0) {
            if (t >= 3600) {
                hours++;
                t -= 3600;
            } else if (t >= 60) {
                minutes++;
                t -= 60;
            } else {
                seconds = t;
                t = 0;
            }
        }
        System.out.println("Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds);   
        
    }
}