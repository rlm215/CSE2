//Rachel Mahoney
//hw 07: NumberStack
//learning how to write similar loops using, for, while and do while
//20 October 2014
import java.util.Scanner;
public class NumberStack{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter an integer between 1 and 9");
        int input = scan.nextInt();
        int dashAcross = 1;
        int numberAcross = 1;
        System.out.println("Using for loops:");
        
        for ( int a = 1; a <= input; a++){
            System.out.println(a);
            for (int b = 0 ; b < input-a-1 ; b++){
                System.out.print(" ");
            }
                for ( int b = dashAcross; b > 0; b--){
                  System.out.print('-');  
                }
            dashAcross += 2;
            System.out.println(" ");
             //increases the number of dashes by 2
    
            }//closes for 
        System.out.println("Using while loops:");
        int a = 1;
        int b = 0;
        int c = 1;
        while (a <= input){
            System.out.println(a);
            a++;
            while (b<input-a-1){
                b++;
                System.out.print(" ");
            }
            //closes first nested while
                while (c > 0){
                    System.out.print('-');
                    c--;
                }
                 c +=2; //increases dashes by 2 
                System.out.println(" ");
        }//closes while 
        System.out.println("Using do while loops:");
        do {
            System.out.println(a);
            a++;
             do {
                 b++;
                 System.out.print(" ");
                do {
                    c--;
                    System.out.println('-');
                }while (c>0);
             }while ( b< input-a-1);
        }while (a <= input);
            c +=2;
            System.out.println(" ");
    }//closes main method
}//closes class