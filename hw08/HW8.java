//Rachel Mahoney
//hw 08
//27 Oct 2014
//this hw will help teach methods/overloaded methods
//uses the overloaded method to ask user for inputs
//then read if it is the correct input

import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
	}
  
        public static char getInput(Scanner s, String cString){
            if (s.hasNext()){
                String x = s.next();
                for (int i=0 ; i< cString.length(); i++)
                    if (x.equals (cString.charAt(i))){
                        char k = cString.charAt(i);
                        return k;
                    }//closes if
                    else {
                        System.out.println("You did not enter character from list, try again");
                    }//closes else
            }//closes bigger if 
            return ' ';
        }//closes C method
        
        public static char getInput(Scanner s, String yString, int attempts){
            int counter = 0;
            while (counter < attempts){
                String x = s.next();
                for (int i = 0; i < yString.length(); i++)
                    if (x.equals (yString.charAt(i))){
                        char k = yString.charAt(i);
                        return k;
                    }//closes if
                    else {
                        System.out.println("You did not enter character from list, try again" );
                        return ' ';
                    }//closes else
                System.out.println("You failed after 5 tries.");
        }//closes while 
        return ' ';
        }//closes Y method
        
        public static char getInput(Scanner s, String display, String nString){
            if (s.hasNext()){
                String x = s.next();
                for (int i = 0; i < nString.length(); i++)
                    if (x.equals (nString.charAt(i))){
                    char k = nString.charAt(i);
                    return k;
                    }//closes if
                    else {
                        System.out.println("You did not return the correct value");
                        return ' ';
                    }//closes else
                    return ' ';
            }//closes big if
            else {
                return ' ';
            }
        }//closes digit method 
}
        