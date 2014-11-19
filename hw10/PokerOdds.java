//Rachel Mahoney
//16 Nov 2014
//HW 10: PokerOdds
//this hw will help to learn arrays
//this program will simulate poker hands
//allow the user to keep generating hands
//and tells number of times hand with a pair of specific rank occurs

import java.util.Random;
import java.util.Scanner;
public class PokerOdds {
    public static void main(String[] arg) {
            showHands();
            simulateOdds();
        } //closes main method

    public static String showHands() {
            Scanner scan = new Scanner(System.in);
            String user = "";
            do { //allows for program to run in conditions of while statement below
                String[] suit = {
                    "Clubs", "Diamonds", "Hearts", "Spades"
                };
                String[] rank = {
                    "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
                };
                int suits = suit.length;
                int ranks = rank.length;
                int combine = suits * ranks; //52 cards
                String[] cardDeck = new String[combine]; //makes array of suits and ranks
                for (int i = 0; i < ranks; i++)
                    for (int j = 0; j < suits; j++)
                        cardDeck[suits * i + j] = suit[j] + " : " + rank[i]; //print out in correct format
                for (int i = 0; i < 5; i++) {
                    int a = i + (int)(Math.random() * (combine - i)); //reduces number of cards in deck by # already pulled
                    String b = cardDeck[a];
                    cardDeck[a] = cardDeck[i];
                    cardDeck[i] = b; //reassign to string b
                    int h = 0;
                    for (int j = 1; j < 6; j++) { //prints out five cards
                        while (h < 1) {
                            System.out.println(cardDeck[i]);
                            h++;
                        }
                    }
                }
                System.out.print("Go again? Enter 'y' or 'Y', anything else to quit");
                user = scan.next();
            } while (user.equals("Y") || user.equals("y"));
            return " "; //need return statement for method
        } //closes show hands


public static int simulateOdds() {
        int duplicates=0;
        System.out.println("Rank:  Freq of exactly one pair");
        for (int totalCards = 0; totalCards < 10000; totalCards++) {
            for (int hand = 0; hand < 4; hand++) {
                for (int card = 0; card< 1; card++) {
                    String[] suit = {
                        "Clubs", "Diamonds", "Hearts", "Spades"
                    };
                    String[] rank = {
                        "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
                    };
                    int suits = suit.length;
                    int ranks = rank.length;
                    int combine = suits * ranks; //52 cards
                    String[] cardDeck = new String[combine];
                    int a = card + (int)(Math.random() * (combine - card)); //reduces number of cards in deck by # already pulled
                    String b = cardDeck[a];
                    cardDeck[a] = cardDeck[card];
                    cardDeck[card] = b;
            
                    

                    for (int h = 0; h < rank.length - 1; h++) {
                        b = rank[h];
                        for (int g = h + 1; g < rank.length; g++) {
                            if (b == rank[g]) { //seeing if numbers in array are equal
                                duplicates++;
                            } 

                        }
                    }
                }
            }
            
        }
        System.out.println(duplicates);
        return duplicates;
}
}

                    /*while (hand < 10000) {
                                    while (int a < 5) {
                                        int i = (int)(Math.random() * 51);
                                        suit = suit[cardDeck[i] / 13];
                                        rank = rank[cardDeck[i] % 13];
                                        a++;
                                    } //closes nested while 
                                    for (int b = 0; b < 5; b++) {
                                        ranks = rank[i];
                                        for (int c = b + 1; c < 5; c++)
                                            if (ranks[] == rank[c]) {
                                                switch (rank) {
                                                    case "A":
                                                        pairA++;
                                                        break;
                                                    case "2":
                                                        pair2++;
                                                        break;
                                                    case "3":
                                                        pair3++;
                                                        break;
                                                    case "4":
                                                        pair4++;
                                                        break;
                                                    case "5":
                                                        pair5++;
                                                        break;
                                                    case "6":
                                                        pair6++;
                                                        break;
                                                    case "7":
                                                        pair7++;
                                                        break;
                                                    case "8":
                                                        pair8++;
                                                        break;
                                                    case "9":
                                                        pair9++;
                                                        break;
                                                    case "10":
                                                        pair10++;
                                                        break;
                                                    case "J":
                                                        pairJ++;
                                                        break;
                                                    case "Q":
                                                        pairQ++;
                                                        break;
                                                    case "K":
                                                        pairK++;
                                                        break;
                                                    default:
                                                        nonPair++;
                                                        break;
                                                } //closes switch statement
                                            } //closes if 
                                    }
                                    hand++;
                                } //closes while loop
                                System.out.print("A         " + pairA);
                                System.out.print("2         " + pair2);
                                System.out.print("3         " + pair3);
                                System.out.print("4         " + pair4);
                                System.out.print("5         " + pair5);
                                System.out.print("6         " + pair6);
                                System.out.print("7         " + pair7);
                                System.out.print("8         " + pair8);
                                System.out.print("9         " + pair9);
                                System.out.print("10        " + pair10);
                                System.out.print("J         " + pairJ);
                                System.out.print("Q         " + pairQ);
                                System.out.print("K         " + pairK);
                                System.out.print("------------------");
                                System.out.print("total not exactly one pair:" +nonPair);
                            } //closes simulateOdds
                    } //closes public class*/
