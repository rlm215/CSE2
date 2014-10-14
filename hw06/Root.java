//Rachel Mahoney
//hw 06: Root
//13 Oct 2014
//using the bisection method to find the square root of number

import java.util.Scanner;
//define a class
public class Root {
    //insert the main method
    public static void main(String [] arg) {
        //start the program body
        Scanner scan;
        scan = new Scanner (System.in);
        System.out.println ("Enter a double greater than zero");
        double input = scan.nextDouble();
        double low = 0; //stores low as 0 
        double high = input + 1; //stores high as the input plus one
        while ((high-low) >= .0000001) {
            double middle = (low+high)/2; //stores middle as the avg b/w high and low
            if ((middle*middle) > input) {
                System.out.println("The root is " +middle);
                high = middle;
            }//closes if 
            else {
                System.out.println("The root is " +middle);
                low = middle;
            }//closes else
        }//closes while
    }//closes main method
}//closes class