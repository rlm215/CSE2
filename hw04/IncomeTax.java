//Rachel Mahoney
//hw04
//20 Sept 2014
//Program 1: Income Tax
//This homework will have user input an int
//Then calculate the income tax based on salary

import java.util.Scanner; //allows for user imputs

//define a class
public class IncomeTax {
    //insert the necessary main method
    public static void main(String [] args) {
        
        //begin program
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        //first scanner to allow input of the int
        
        //Enter int to convert to thousands
        
        double taxrate1, taxrate2, taxrate3, taxrate4;
        double totalTax1, totalTax2, totalTax3, totalTax4;
        System.out.println ("Enter an int giving the number of thousands- ");
        if(myScanner.hasNextInt()){
            int input = myScanner.nextInt();
            double salary = input*1000;
            if (input >0) {
                if (input<20) { //first tax bracket 
                    taxrate1 = .05;
                    totalTax1 = (input*1000)*.05;
                    totalTax1 = Math.round (totalTax1*100);
                    totalTax1 = totalTax1/100.0;
                    System.out.println ("The tax rate on " +input*1000+  " is 5.0% , and the tax is " +totalTax1+ ".");
                    return;
                }
                 if ((input>=20) && (input <40)) { //second tax bracket
                    taxrate2 = .07;
                    totalTax2 = (input*1000)*.07;
                    totalTax2 = Math.round (totalTax2*100);
                    totalTax2 = totalTax2/100.0;
                    System.out.println ("The tax rate on " +input*1000+ " is 7.0% , and the tax is " +totalTax2+ ".");
                    return;
                    }
                else if ((input>=40) && (input<78)) { //thired tax bracket//
                    taxrate3 = .12;
                    totalTax3 = (input*1000)*.12;
                    totalTax3 = Math.round (totalTax3*100);
                    totalTax3 = taxrate3/100.0;
                    System.out.println ("The tax rate on " +input*1000+ " is 12.0% ,and the tax is " +totalTax3+ ".");
                    return;
                }
                else { //don't need a condition here since number >= 78 are other 
                    taxrate4 = .14;
                    totalTax4 = (input*1000)*.14;
                    totalTax4 = Math.round(totalTax4*100);
                    totalTax4 = totalTax4/100.0;
                    System.out.println ("The tax rate on " +input*1000+ " is 14.0% , and the tax is " +totalTax4+ ".");
                    return;        
                     }
            } //end check int >0
            else {
                System.out.println ("You did not enter a positive int");
                //leaves the program
                return;
        }
        }
        else {
            System.out.println ("You did not enter an int");
            return; //leaves the program 
        }
    }
}