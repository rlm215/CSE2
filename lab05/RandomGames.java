//Rachel Mahoney
//lab 05: RandomGames
//24 Sept 2014
//learning how to use switch statements and Math.random
//Ask for input of 3 games and run program based off game chosen

import java.util.Scanner ;

//define a class
public class RandomGames {
    //insert the necessary main method
    public static void main(String [] args) {
        
        //begin the program
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.println ("Enter R or r for Roulette, C or c for craps, P or p for pick a card-");
        String input = myScanner.next();
        if (input.equals("P") || input.equals("p") || input.equals("R") || input.equals("r") || input.equals("c") || input.equals("C")){
            switch (input) {
                case "P" : case "p":
                    System.out.println ("Picking a card not implemented yet");
                    break;
                case "C" : case "c":
                    System.out.println ("Craps option not implemented yet");
                    break;
                case "R" : case "r":
                    int random = (int) Math.ceil(Math.random()*36);
                    System.out.println("Roulette: " +random+ ".");
                    break;
            }//closes switch
        }//closes if
        else{
            System.out.println ("'" +input+ "' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
            return;
        }//closes else
                    
    }//closes main method
    
}//closes class