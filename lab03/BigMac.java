//Rachel Mahoney
//Lab 3
//11 Sept 2014
//Big Mac 
//This lab will help demonstrate how to use the Scanner class
//Scanner class allows a user to input values 
//Inputs will be:
    // Number of Big Macs
    // Cost per Big Mac
    // Tax Percent 
import java.util.Scanner; //this imports scanner allowing user inputs

//define a class
public class BigMac {
    //insert a main method
    //main method is needed in every Java program
    public static void main(String [] args) {
        
    //start program body
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    //Allow for the input of varables
    
    //Enter number of Big Macs
    System.out.println ("Enter the number of Big Macs (integer>1): ");
    int nBigMacs = myScanner.nextInt();
    
    //Enter cost of Big Macs
    System.out.println ("Enter the cost per Big Mac as a double (in the form xx.xx): ");
    double bigMacCost = myScanner.nextDouble();
    
    //Enter the percent tax
    System.out.println ("Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble ();
    taxRate/=100; //converts the tax to a proportion
    
    //Compute the output now that all the inputs are included
    double cost$;
    int dollars, dimes, pennies; //insert comment here
    cost$= nBigMacs*bigMacCost*(1+taxRate); //computes total cost with no rounding
    
    //computes the whole dollar amount
    dollars= (int)(cost$);
    
    //compute the number of dimes in the final cost
    dimes = (int)(cost$*10)%10;
    
    //compute the number of pennies in the final cost
    pennies= (int)(cost$*100)%10;
    
    //Print out the whole final rounded cost
    //Includes whole dollar amount, dimes and pennies
    System.out.println ("The total cost of " +nBigMacs+ " BigMacs, at $" +bigMacCost+ " per BigMac, with a sales tax of " +(int)(taxRate*100)+ "%, is $" +dollars+"."+dimes+pennies+".");
    
        } //closes main method
    } //closes class
                           