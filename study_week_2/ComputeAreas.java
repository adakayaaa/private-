package week_02.study;

public class ComputeAreas {
    public static void main(String[] args) {

        //Step 1: Declare radius and area
        double radius;
        double area;

        // Assign a radius
        radius = 20;

        //Step 2: Compute area
        area = radius * radius * 3.14159;

        // Step 3: Display the area
        System.out.println("Area for the circle of raidus " + radius + " is " + area);

        /* Variables such as radius and area correspond to memory locations. Every variable has a name, a
        type, a size, and a value.-Line 7 declares that radius can store a double value. The value is not deÞned until you assign a value.
        - Line 11 assigns 20 into variable radius.
        - Line 8 declares variable area,
        - Line 12 assigns a value into area.
        - Line 18 The plus sign (+) is called a string concatenation operator. It combines two strings
into one.
        */

        /*
        Caution
        A string cannot extend across multiple lines. Therefore, the statement below would lead to a
        compilation error:
               System.out.println("I love
               Inar Academy");
        The correct code should be:
               System.out.println("I love " +
               "Inar Academy");

         */
    }
}
