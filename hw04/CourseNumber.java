//Rachel Mahoney
//hw04
//Sept 22 2014
//Program 3: CourseNumber
//This lab will tell when course offered based off a 6 digit number 

import java.util.Scanner; //allows for the user to input values

//define a class
public class CourseNumber {
    //insert the needed main method
    public static void main(String [] args){
        
        //begin the program
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //Enter the six digit number
        System.out.println ("Enter a six digit number giving the course semester-");
        int number = myScanner.nextInt();
        int year = number/100;
        int semester = number%100;
            if ((number >= 186510) & (number <=201440)) {
                    switch (semester) {
                        case 10:
                            System.out.println ("The course was offered in the spring semester of " +year+ ".");
                            break;
                            //remainder is 10 = spring
                        case 20:
                            System.out.println ("The course was offered in the Summer 1 semester of " +year+ ".");
                            break; 
                            //remainder is 20 = summer 1
                        case 30:
                            System.out.println ("The course was offered in the Summer 2 semester of " +year+ ".");
                            break;
                            //remainder is 30 = summer 2
                        case 40:
                            System.out.println ("The course was offered in the Fall semester of " +year+ ".");
                            break;
                            //remainder is 40 - fall
                        default:
                            System.out.println ("This is not a legitimate semester.");
                            break;
                      } //ends switch  
            }// ends if
        else{
            System.out.println ("The number was outside the range [18650,201440]" );
            return;
            //not in range of values
        }
    }
    
}