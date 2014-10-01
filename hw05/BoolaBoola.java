//Rachel Mahoney
//hw 05: BoolaBoola
//30 Sept 2014
//learning boolean statements

import java.util.Scanner;
//define a class
public class BoolaBoola {
    //insert the main method
    public static void main(String [] args) {
        //begin the program
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        boolean random,random2,random3;
        random = true || false;
        random2 = false || true;
        random3 = false || true;
        System.out.println ("does " + " &&" +random2+ "||" +random3+ "have the value true(T,t) or false(F,f)");
            if(myScanner.hasNextBoolean()){;
            boolean answer = myScanner.nextBoolean();
                if (answer==true){
                        System.out.println ("correct");
                }
                else if  (answer ==false){
                        System.out.println ("wrong");
                }//closes else if 
                else {
                    System.out.println("Wrong; try again");
                }
            }//closes big if
            else{
                System.out.println("Wrong; try again");
                return;
            }//ends else
        
    }//end main method
}//ends class