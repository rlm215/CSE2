//Rachel Mahoney
//hw03
//Program 1: Bicycle
//11 Sept 2014
//Allowing user inputs to find distance traveled and avg mph

import java.util.Scanner; //allows for user inputs

//define a class
public class Bicycle {
    //insert a main method
    //you always need a main method
    public static void main(String [] args){
        
    // Start program main body
    Scanner myScanner;
    myScanner= new Scanner (System.in);
    
    //Enter the number of seconds
    System.out.println ("Enter the number of seconds:");
    int Seconds = myScanner.nextInt();
    
    //Enter the number of counts from cyclometer
    System.out.println ("Enter the number of counts:");
    int Counts = myScanner.nextInt();
    
    //Calculate distance and avg mph
    double wheelDiameter = 27.0; //given wheel diameter
    double PI = 3.14; //value of PI
    double inchesPerFoot=12.0; //helps for conversion
    double secondsPerminute=60.0; // also helps for conversion
    double minutesPerhour=60.0;
    double feetPerMile=5280.0;
    double distance, AvgMPH;
    
    //Equations to calculate final outputs
    distance = (Counts*wheelDiameter*PI/inchesPerFoot/feetPerMile);
    AvgMPH = distance/ (Seconds/secondsPerminute/minutesPerhour);
    
    //round the final output answers
    double roundDistance = (double) Math.round(distance*100)/100;
    double roundAvgMPH = (double) Math.round(AvgMPH*100)/100;
    
    //Print out results
    System.out.println ("The distance was " +roundDistance+ " miles, and took " +Seconds/secondsPerminute+ " minutes.");
    System.out.println ("The average mph was " +roundAvgMPH+ ".");

    } //closes main method
} //closes class