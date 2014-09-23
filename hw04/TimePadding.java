//Rachel Mahoney
//hw04
//22 Sept 2014
//Program 4: Time Padding 
//This homework will have user input seconds
//Then convert to time of day

import java.util.Scanner; //allows for user inputs

//define a class
public class TimePadding {
        //insert the needed main method
        public static void main(String [] args) {
            
            //begin the program
            Scanner myScanner;
            myScanner = new Scanner (System.in);
            
            System.out.println ("Enter the time in seconds:");
            int time = myScanner.nextInt();
            int hours, minutes, seconds;
            if (time > 0) {
                hours = (time/60)/60; //finds hours
                minutes = (time/60)%60 // minutes is seconds divdided by 60 twice then remainder
                seconds = input%60 // seconds is remainder after divided by 60
                
                if (hours == 0 )
            }
}