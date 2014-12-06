//Rachel Mahoney
//lab 07
//loops

import java.util.Scanner;
public class LoopTheLoop{
    public static void main(String[] arg){
        int input = -1;
        System.out.println("Enter and int between 1 and 15");
            Scanner scan = new Scanner (System.in);
            input = scan.nextInt();//checks if int
        while ( input < 1 || input > 15 ){ //runs loop until in range 
            System.out.println("You did not enter an int between 1 and 15");
            input = scan.nextInt();
        }//closes while 
        
        //loop to print out stars
        for (int i =1; i<=input; i++){
            System.out.print("*");
        }
        for (int a = 0; a<=input; a++){
            for (int b = 1; b <= a; b++){
                System.out.print("*");
            }//closes inside for
            System.out.println("\n");
        }//closes outside for 
    }//closes main method
}//closes public class