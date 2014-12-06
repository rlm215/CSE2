//Rachel Mahoney
//lab 08
//learning how to convert between the different types of loops
//17 October 2014
import java.util.Scanner;
public class MoreLoops {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        /*System.out.print("Enter an int- ");
        while (!scan.hasNextInt()) {
            scan.next(); //get rid of the junk entered by user
            System.out.print("You did not enter an int; try again- ");
        }
        */
        //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A 
        //DO-WHILE LOOP

        System.out.print("Enter an int- ");
        do {
            if (!scan.hasNextInt()) {
                scan.next();
                System.out.print("You did not enter an int; try again- ");
            }
            else {
                n = scan.nextInt();
            }
        } while (n == 0);

        //n = scan.nextInt();

        /*for (int j = 0; j < n && j < 40; j++) {
            for (int k = 0; k < j + 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        */

        //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH 
        //WHILE STATEMENTS
        int j = 0;

        while (j < n && j < 40) {
            int k = 0;
            while (k < j + 1) {
                System.out.print('*');
                k++;
            } //end inner while loop
            System.out.println();
            j++;
        } //end outer while loop

        int k = 4;

        /* do {
            System.out.println("k=" + k);
            k++;
        }
        while (k < 4);
        */
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
        //WITH A WHILE LOOP

        while (k < 4) {
            System.out.println("k=" + k);
            k++;
        }

        /* int count = 0;
        while (true) {
            switch (n) {
                default: System.out.println(n + " is > 5 or <1");
                break;
                case 1:
                case 2:
                    System.out.print("Case 2 ");
                    continue;
                case 3:
                    break;
                case 4:
                    System.out.println("Case 4");
                case 5:
                    System.out.println("Case 5");
                    break;
            }
            count++;
            if (count > 10)
                break;
        }
        */

        //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE UING
        // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
        //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
        //   -5, 1, 20, 5, ETC.
        //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
        //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY

        for (int count = 0; count < 10; count++) {
            if (n > 5 || n < 1) {
                System.out.println(n + " is > 5 or <1");
                break;
            }
            else if (n == 1 || n == 2) {
                System.out.print("Case 2 ");
                break;
            }
            else if (n == 3) {
                break;
            }
            else if (n == 4) {
                System.out.println("Case 4");
                n = 5;
            }
            else {
                System.out.println("Case 5");
                break;
            }
        }
    }
}