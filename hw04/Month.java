//Rachel Mahoney
//hw04
//21 Sept 2014
//Program 2: Month
//This homework will print number of days in month

import java.util.Scanner;

//define a class
public class Month {
    //insert the needed main method
    public static void main(String [] args) {
        
        //begin the program
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        int Days;
        int Year;
        
        System.out.println ("Enter an int giving the number of the month (1-12) - ");
            if (myScanner.hasNextInt()){;
                int month = myScanner.nextInt();
                if (month <=12){;
                    switch (month){
                        case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : //month numbers with 31 days
                        Days = 31;
                        System.out.println ("The month has " +Days+ " days.");
                        break; 
                    case 4 : case 6 : case 9 : case 11: //months with 30 days
                        Days = 30;
                        System.out.println ("The month has " +Days+ " days.");
                        break;
                    case 2: 
                        System.out.println ("Enter an int giving the year");
                        Year = myScanner.nextInt();
                            if (((Year % 4 == 0) && (Year % 100 == 0)) && (Year % 400 ==0)){
                            //the year needs to be divisible by 4, 100 and 400 to be a leap year
                            Days = 29;
                            System.out.println ("The month has " +Days+ " days.");
                            }
                            else {
                            Days = 28;
                            System.out.println ("The month has " +Days+ " days.");
                            break;
                            }
                    }}
                else{
                    System.out.println ("You did not enter an int between 1 and 12");
                    return; //matches with month <= 12 if statement 
                }
            }
            else{
                System.out.println ("You did not enter an int");
                return; // matches the first if statement 
            }
    
}
}
