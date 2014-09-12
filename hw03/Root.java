//Rachel Mahoney
//hw03
//Program 2: Root
//11 Sept 2014
//Allowing user input to calculate the following:
    //Estimate of the cube root
    //Value when estimate is cubed
    import java.util.Scanner;
    
    //define a class
    public class Root {
        //insert required main method
        public static void main(String [] args){
        
        //Start program main body
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        //Enter a double
        System.out.println ("Enter a double, and I print its cubed root- ");
        double number = myScanner.nextDouble();
        
      
        double root, root1, root2, root3, root4, root5;
        
        
        //calculate cubed root and improve 4 times
        root = number/3;
        root1 = (root*root*root+number)/(3*root*root);
        root2 = (2*root1*root1*root1+number)/(3*root1*root1);
        root3 = (2*root2*root2*root2+number)/(3*root2*root2);
        root4 = (2*root3*root3*root3+number)/(3*root3*root3);
        root5 = (2*root4*root4*root4+number)/(3*root4*root4);
        
        //print out result 
        System.out.println ("The cube root is " +root5+": " +root5+"*"+root5+"*"+root5+"=" +(root5*root5*root5)+ " .");
        
            
        } //closes the method
    } //closes the class