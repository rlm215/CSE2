//Rachel Mahoney
//lab 11

import java.util.Scanner;
public class Arrays {
    public static void main(String[] arg) {
            int[] group = new int[10];
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 10 ints");
            for (int a = 0; a < group.length; a++) {
                group[a] = input.nextInt();
            } //closes input for loop

            //search for highest value in array
            int max = group[0];
            for (int b = 1; b < group.length; b++) {
                if (group[b] > max)
                    max = group[b];
            } //closes highest value for
            System.out.println("The highest entry is " + max);

            //search for lowest value in array
            int low = group[0];
            for (int c = 1; c < group.length; c++) {
                if (group[c] < low)
                    low = group[c];
            } //closes lowest value for
            System.out.println("The lowest entry is " + low);

            //calculate the sum
            int total = 0;
            for (int d = 0; d < group.length; d++) {
                total += group[d];
            } //closes sum for 
            System.out.println("The sum is " + total);

            //print array in reverse order
            final int shift[] = group;
            int temp = shift[0];
            for (int e = 1; e < shift.length; e++) {
                shift[e - 1] = shift[e];
                } //closes reverse for
            shift[shift.length - 1] = temp;
            
            for (int z = 0; z < 10; z++) {
                for (int f = 0; f < 1; f++) {
                    System.out.println(group[z]+ "  " +shift[z]);
                }
            }
        } //closes main method
} //closes class
