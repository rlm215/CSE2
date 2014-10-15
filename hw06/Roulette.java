//Rachel Mahoney
//hw 06: Roulette 
//14 Oct 2014
//learning how to program Monte Carlo Simulations 
//This program will simulate 100,000 spins on a roulette wheel
//Then it will collect data/calculate total winnings 

public class Roulette {
    public static void main (String [] args) {
        int number = 1; //number of roulette wheel
        int match = 0; //number of matches from bet and spin, sets at zero to begin 
        double winnings = 0; //establishes total winnings at zero 
        int spins = 1; //sets program for first spin
        int simulation = 1; //sets program for first simulation
        int spin;
        while (number <= 38){
            while (spins <= 100){
                while (simulation <= 1000){
                    spin = (int)(Math.random()*38.0); //random number between 1 and 38
                    if (spin == number){ //spins matches the bet 
                        winnings = winnings + 36; 
                        match++ ;//increases the number of matches by 1
                        spins++ ;//increases the number of spins by 1
                        simulation++ ;//increases the number of simulations by 1 
                    }//closes if 
                    else{
                        spins++ ;//still need to increase spins even though no match
                        simulation++ ;//also need increase simulations by 1 
                    }//closes else
                    System.out.println ("Your total winnings are " +winnings);  
                    System.out.println ("Your total matches are " +match);
                    ++number ;//increases to the next number on wheel
                }//closes third while 
            }//closes second while
        }//closes while 
    }//closes main method 
}//closes class