//Rachel Mahoney
//hw 10
//2 Nov 2014
//learning how to print nested sequence of method calls
//asks user for input then check for int and range

import java.util.Scanner;
public class BlockedAgain {
    public static void main(String[] s) {
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }


    public static int getInt() {
        System.out.println("Enter an int between 1 and 9 inclusive.");
        Scanner scan;
        scan = new Scanner(System.in);
        int input = checkInt(scan);//checks that input is int
        input = checkRange(input);//checks that input is in range
        return input;//returns the int to main method
    }
    public static int checkInt(Scanner scan) { //method to check int
            int a = 0;
            if (scan.hasNextInt()) {
                a = scan.nextInt();
            } //closes if
            else {
                System.out.println("You did not enter an int; try again");
                Scanner in = new Scanner(System.in);
                a = checkInt( in ); //recalls scanner
            } //closes else
            return a;
        } //closes checkInt

    public static int checkRange(int b) {
            if ((b >= 1) & (b <= 9)) {} //if doesn't need statement
            //automatically returns b
            else {
                System.out.println("You did not enter and int in [1,9]; try again.");
                Scanner call = new Scanner(System.in);
                b = checkInt(call); //recalls scanner
            } //closes else
            return b;
        } //closes checkRange

    public static void allBlocks(int c) {
            int input = getInt(); //calls the int input from getInt
            int across = 1;
            int down = 1;
            for (int a = 1; a <= input; a++) {
                for (c = 0; c < input - 1; c++) {
                }
                for (int j = 0; j <= a - 1; j++) {
                    for (int b = across; b > 0; b--) {
                        System.out.print(" ");
                        System.out.print(a);
                    }
                    System.out.println("\n ");
                }
                
                for (int b = across; b > 0; b--) {
                    System.out.print(" ");
                    System.out.print('-');
                }
                
                System.out.println("\n ");
                across += 2;
            }
            
            

        } //closes allBlocks
        /*when I tried to convert my code into the other methods it didn't work.
        I couldn't get the desired print out with the multiple methods
        and was in fact worse than the print out I gave in this one method. 
            
            public static void block(){ //calls line
            
            }//closes block method

            public static int line(int c){
               
            }//close line*/

} //closes class
