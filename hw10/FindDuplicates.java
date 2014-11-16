//Rachel Mahoney
//16 Nov 2014
//HW 10
//learning how to use arrays
//this program will tell if I have any duplicate numbers 
//in an array and if there is only one set of duplicate numbers

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }//closes if
      out+=num[j];
    }//closes for
    out+="} ";
    return out;
  }//closes listArray
    public static boolean hasDups(int num[]){
        int duplicates=0;
        int number;
        for(int a=0; a<num.length-1;a++){
            number = num[a];
            for (int b=a+1; b<num.length; b++){
                if (number == num[b]){
                    duplicates++;
                }
                else{
                    duplicates= duplicates;
                }//closes else
            }//closes nested for loop
        }//closes big for loop
        if (duplicates>0){
            return true;
        }
        else{
            return false;
        }//closes else
    }//closes hasDups
    
    public static boolean exactlyOneDup(int num[]){
        int duplicates = 0;
        int number;
        for (int a=0; a<num.length-1;a++){
            number = num[a];
            for (int b=a+1;b<num.length;b++ ) {
                if(number == num[b]){
                   duplicates++; 
                }//cloese if
                else{
                    duplicates= duplicates;
                }//closes else
            }//closes nested for
        }//closes main for loop
        if(duplicates == 1){
            return true;
        }//closes if
        else{
            return false;
        }
    }//closes exactlyOneDup
  
}
