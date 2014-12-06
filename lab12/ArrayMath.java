//Rachel Mahoney
//The method equals() should take two arrays of doubles as input and return true if and only if the two arrays are of the same 
//length and have the same values in the same locations. The method addArrays() should take two arrays of doubles as input 
//and return a new array of doubles whose entries are the sum of the entries at the corresponding indices 
//of the input arrays (i.e. result[2] = array1[2] + array2[2]).
public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals(double [] a, double b){
      boolean z = true;
          if (a.length != b.length){
              z = false;
          }
          else{
              for (int i = 0; i < b.length; i++) {
                  if (b[i] != a[i]) {
                      z = false;    
                  }                 
            }
        System.out.println(b);
    }
 
  
  public static double[] addArrays(double [] c, double d){
    int[] e = new int[c.length];
    for (int i = 0; i < c.length; i++) {
        e[i] = c[i] + d[i];
    }
    return e;
  }//closes addArrays method 
}//closes class

