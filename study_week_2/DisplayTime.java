package week_02.study;

import java.util.Scanner;

        /*
        The program in Example obtains minutes and remaining seconds
        from an amount of time in seconds
        */
public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        // Find minutes in seconds
        int minutes = seconds/60;

        //Second remaining
        int remainingSeconds = seconds % 60 ;

        System.out.println(seconds + " seconds is " + minutes + " minutes and "  +
                remainingSeconds + " seconds");

    }
}
