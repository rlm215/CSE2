//Rachel Mahoney
//hw03
//Program 3: Four Digits
//11 Sept 2014
//User enters a double and program prints out the four digits after decimal

import java.util.Scanner; //allows user to input

    //define a class
    public class FourDigits {
        //Insert required main method
        public static void main(String [] args){
        
        //Start program main body
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //Have user input double with 4 decimal places
        System.out.print("Enter a double and I display the four digits to the right of the decimal point.");
        double Digits = myScanner.nextDouble (); 
        
        double input; 
        input= Digits;  
        int first, second, third, fourth; //variables for each place
        
        
        //Program to print the four digits 
        
        //First digit after the decimal point
        first = (int)(input*10)%10;
        
        //Second digit after the decimal point
        second = (int)(input*100)%10;
        
        //Third digit after the decimal point
        third = (int)(input*1000)%10;
        
        //Fourth digit after the decimal point
        fourth = (int)(input*10000)%10;
        
        
        System.out.print("The four digits are " +first+ +second+ +third+ +fourth+ ".");
            
        } //closes main method
    } //closes class