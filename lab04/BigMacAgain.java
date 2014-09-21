//Rachel Mahoney
//Lab 04
//17 Sept 2014
//Big Mac Again
//This lab will help teach how to use selection statements under certain conditions

import java.util.Scanner; //allows for user inputs

//define a class
public class BigMacAgain {
    //insert a main method
    //main method is needed in every Java program
    public static void main(String [] args) {
        
        //start program body
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        //Allow for the input of varables
    
        //Enter number of Big Macs
        System.out.println ("Enter the number of Big Macs (integer>1): ");
        double finalcost;
        double noFmealcost;
        if(myScanner.hasNextInt()) {
            int nBigMacs= myScanner.nextInt(); 
            
            if (nBigMacs>0) {
                finalcost= 2.22*nBigMacs; //cost of number of burgers
                finalcost= Math.round (finalcost*100); //round this cost
                finalcost= finalcost/100.0;
                System.out.println("You ordered " +nBigMacs+ " Big Macs for a cost of " +nBigMacs+ "*2.22 =" +finalcost+ ".");
    
                Scanner scanner = new Scanner(System.in); //new scanner to ask for fries
                double costoffries= 2.15;
                //Enter if customer wants fries with that 
                System.out.println ("Do you want an order of fries (N/Y/n/y)");
                String Fries = scanner.next();
    
                if(Fries.equals("Y") || Fries.equals("y")){ //if person orders fries
                    double mealcost= (finalcost+costoffries); //cost of meal with fried
                    mealcost = Math.round (mealcost*100); //round the answer
                    mealcost = mealcost/100.0;
                    System.out.println ("You ordered fries at a cost of $2.15" );
                    System.out.println ("The total cost of your meal is " + (mealcost) + "."); // print out final cost of the order
        
                }
                else if (Fries.equals("N") || Fries.equals("n")){ //if person doesn't order fries
                    noFmealcost =  Math.round (finalcost*100);// final cost with no fries
                    noFmealcost = noFmealcost/100.0;
                    System.out.println ("The total cost of your meal is " +noFmealcost+ ".");
                    
                }
                else {
                System.out.println("You did not enter a Y/y/N/n");
                return; //program terminates
                }
                
                }
   
        else {
        System.out.println("You did not enter an integer>0");
        return; //leaves the program
    }
         }
        else {
            System.out.println("You did not enter an int");
            return;    //leaves the program, i.e.
                    //the program terminates
        
        }
        
    //int nBigMacs= myScanner.nextInt();
        
    
    
    }
}
    