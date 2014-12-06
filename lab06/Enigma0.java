import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      int n=4;
      System.out.println("You entered "+n);
    }
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}
/*Error report: 
 *
 *n is not initialized in the switch statement.
 *It is only initialized in the if statement. 
 * 
 * 
 * 
 */