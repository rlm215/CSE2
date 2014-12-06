import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
  
  	public static void getInt (Scanner scan){ //returns max of 2 values
 		int a; 
 		for (h=0; h<2; h++){	
 			if (scan.hasNextInt()){
 				a = scan.nextInt();
 				}
 			else{
 				System.out.println("You did not enter an int"){
 			}
 			return a
 		}
 	}//closes two int method 
  	
  	public static int larger (int d, int e ){
  		if (d < e){
  			return e;
  		}
  		else{
  			return d;
  		}
  	}//closes larger method
  	
  	public static boolean ascending ( int f, int g, int h ){
  		if ( f < g && f < h){
  			return true;
  		}
  		else{
  			return false; 
  		}
  	}// closes ascending 
  	
  	
  	
}

