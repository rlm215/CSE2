//Rachel Mahoney
//3 Dec 2014
//HW 11
//Learning how to use multidimensional arrays
//this program will prompu user to enter 5 poker cards
//then tell them what type of hand they have

import java.util.Scanner;
public class PokerHands {
    public static void main(String[] arg) {
            Scanner input = new Scanner(System.in);
            String Newhand[][] = formHand(); //stores inputs into array
            int hand[] = new int[5];

        } //closes main method
        //this code was given in assignment
        /*public static void showOneHand(int hand[]) {
            String suit[] = {
                "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
            };
            String face[] = {
                "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ", "4 ", "3 ", "2 "
            };
            String out = "";
            for (int s = 0; s < 4; s++) {
                out += suit[s];
                for (int rank = 0; rank < 13; rank++)
                    for (int card = 0; card < 5; card++)
                        if (hand[card] / 13 == s && hand[card] % 13 == rank)
                            out += face[rank];
                out += '\n';
            }
            System.out.println(out);
        }//closes showOneHand*/

    //first prompt the user to enter cards
    public static String[] Cards(Scanner scanner) {
            System.out.print("Enter the suit 'c', 'd', 'h', or 's'- ");
            String suit = scanner.next();
            //use a method to check if valid card here 
            InputCheck(suit, scanner);
            System.out.print("Enter one of 'a', 'k', 'q', 'j'...");
            String face = scanner.next();
            String cardFace[] = {
                suit, face
            };
            return cardFace;
        } //closes Cards method

    //check if inputs are valid
    public static void InputCheck(String a, Scanner input) {
            if ((a.equals("d")) || (a.equals("h")) || (a.equals("c")) || (a.equals("s"))) {} //closes if 
            else {
                System.out.println("You did not enter a valid response");
                System.out.println("Enter the suit 'c', 'd', 'h', or 's'- ");
                //need to redo the pick so ask for another input, but set as the String to recheck
                String wrongInput = input.next();
                a = wrongInput;
            } //closes else statement 
        } //closes InputCheck

    //check if same card
    public static void checkValue(String b) {} //closes checkValue

    //after 5 inputs form one hand 
    //use array for each card, then join to make hand
    public static String[][] formHand() {
            String one[] = new String[2];
            String two[] = new String[2];
            String three[] = new String[2];
            String four[] = new String[2];
            String five[] = new String[2];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 'Y' or 'y' to make another hand");
            String answer = scanner.next();
            //form hand
            if ((answer.equals('y')) || (answer.equals('Y'))) { // can only form is user says yes
                one = Cards(scanner);
                two = Cards(scanner);
                three = Cards(scanner);
                four = Cards(scanner);
                five = Cards(scanner);
            }
            String hand[][] = {
                one, two, three, four, five
            };
            return hand;
        } //closes formHand

//start checking the hand
//check four of a kind
public static boolean FourOfAKind (int[] hands){
        int count = 0;
        for (int i = 0; i <= 4 ;i++){ 
            count = 0;
            for (int j = i+1 ; j <= 4 ; j++){
                if (hands[i] == (hands[j])){ 
                    count++;
                }
 
                if (count == 4){
                    return true;
                }
            }
        }
        return false;
}//closes four of a kind

public static boolean ThreeOfAKind(int[] hands){
     int count = 0;
        for (int i = 0; i <= 4 ;i++){ 
            count = 0;
            for (int j = i+1 ; j <= 4 ; j++){
                if (hands[i] == (hands[j])){ 
                    count++;
                }
 
                if (count == 3){
                    return true;
                }
            }
        }
        return false;
}//closes three of a kind

public static boolean Pair(int[] hands){
    int count = 0;
        for (int i = 0; i <= 4 ;i++){ 
            count = 0;
            for (int j = i+1 ; j <= 4 ; j++){
                if (hands[i] == (hands[j])){ 
                    count++;
                }
 
                if (count == 2){
                    return true;
                }
            }
        }
        return false;
}

}






























/*import java.util.Scanner;
public class PokerHands{
    public static void main(String [] args){
        String suit = "r"; 
        String face = "t";
        String card = "rt";
        int number = 0; 
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 'y' or 'Y' to enter another hand- ");
        String answer= scan.next(); 
        while (answer.equals("y") || answer.equals("Y")){
            while( number < 5 ){
                for(int j = 0; j<1; j++){
                    System.out.println("Enter the suit: 'c', 'd', 'h', or 's'- ");
                    suit = scan.next();
                    if (suit.equals("c") || suit.equals("d") || suit.equals("h") || suit.equals("s")){
                        System.out.println (" Enter one of 'a', 'k', 'q', 'j' or numbers 2-10");
                        face = scan.next();
                    }//closes if
                    else{
                    System.out.println("You did not enter a valid response");
                    }//closes else 
                    
                    String finalCard = suit+face;
                    System.out.println(finalCard);
                    
                    if(finalCard == card){
                        System.out.println("You already entered that card");
                        card = finalCard;
                        //i--;//reduces i-- to allow for another correct guess 
                    }//closes if 
                    else{
                        System.out.println(" ");
                    }//closes else
                }//closes inside for
                number++; 
            }//closes while
            System.out.println("Enter 'y' or 'Y' to enter another hand- ");
            answer= scan.next(); 
        }//closes while 
        
    }//closes main method
}//closes class*/