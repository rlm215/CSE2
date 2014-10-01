//Rachel Mahoney
//hw05: Burger King
//26 Sept 2014
//help learn: selection statements, boolean and operators

import java.util.Scanner;

//define a class
public class BurgerKing {
    //insert the needed main method
    public static void main(String [] args) {
        
        //being the program
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.println ("Enter a letter to indicate choice of Burger (B or b) Soda (S or s) Fries(F or f)");
        String order = myScanner.next();
        if (order.equals("B") || order.equals("b") || order.equals("S") || order.equals("s") || order.equals("F") || order.equals("f")){
            switch (order) {
                case "B" : case "b" :
                    System.out.println("Enter A or a for 'all the fixins', C or c for Cheese, N or n for none of the above");
                    String burger = myScanner.next();
                        switch (burger) {
                            case "a" : case "A" :
                                System.out.println ("You ordered a burger with all the fixins");
                                break;
                            case "c" : case "C" :
                                System.out.println ("You ordered a burger with cheese");
                                break;
                            case "n" : case "N" :
                                System.out.println ("You ordered a burger with no fixins or cheese");
                                break;
                        }}//ends switch for burger 
            switch (order) {
                case "S" : case "s" :
                    System.out.println("Do you want Pepsi(p or P), Coke(c or C), Sprite(s or S), or Mountain Dew(m or M)");
                    String soda = myScanner.next();
                        switch (soda) {
                            case "p" : case "P" :
                                System.out.println ("You ordered a pepsi");
                                break;
                            case "c" : case "C" :
                                System.out.println ("You ordered a coke");
                                break;
                            case "s" : case "S" :
                                System.out.println ("You ordered a sprite");
                                break;
                            case "m" : case "M" :
                                System.out.println ("You ordered a mountain dew");
                                break;
                        }}// ends switch for soda
            switch (order) {
                case "F" : case "f" :
                    System.out.println ("Do you want a large or small order of fries (L,l,S,s)");
                    String fries = myScanner.next();
                        switch (fries) {
                            case "L" : case "l" :
                                System.out.println ("You ordered large fries");
                                break;
                           case "S" : case "s":
                                System.out.println ("You ordered small fries");
                                break;
            
                                
                        }}//ends fries switch
        }//closes if 
        else{
            System.out.println("You did not enter any of B, b, S, s, F, or f");
            return;
        }//closes else
        
       
        
    } //closes main method
} //closes the class