import java.util.Scanner;
public class x{
    public static void main (String [] args){
       int [] list = new int[5];
       list[0]=6;
       list[1]=3;
       list[2]=4;
       list[3]=9;
       list[4]=11;
       for(int i = 0 ; i< list.length-1; i++){
           int currentMin= list[i];
           int currentMinIndex= i;
           
           for(int j =i+1; j<list.length; j++){
               if(currentMin>list[j]){
                   currentMin=list[j];
                   currentMinIndex=j;
               }
           }
          if(currentMinIndex != i){
              list[currentMinIndex]= list[i];
              list[i] = currentMin;
              for(int h=0;h<list.length;h++ ){
              System.out.println(list[h]);
              }
          } 
    }
    

    
}//closes class
}