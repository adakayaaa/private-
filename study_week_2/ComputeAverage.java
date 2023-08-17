package week_02.study;

//Scanner is in the java.util package
import java.util.Scanner;
public class ComputeAverage {
    public static void main (String [] args ) {

        Scanner input = new Scanner (System.in);

        // Prompt the user to enter three numbers
        System.out.print( "Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " " +
                " is "+ average);

        /*
         Up until now, the programs we've learned about follow a common pattern called IPO,
         which stands for Input, Process, and Output. Input involves gathering information
         from the user,process involves using that input to generate results,
         and output entails showing those results
         */
    }

}
