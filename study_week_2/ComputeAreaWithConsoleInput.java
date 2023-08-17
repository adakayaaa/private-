package week_02.study;

//Scanner is in the java.util package

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius

        /* On line 18, a string "Enter a number for radius: " is shown on the console.
        This is called a prompt.
         */

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * 3.14159;

        //Display results
        System.out.println("The area for the circle of radius" + radius + " is " + area);


    }
}
