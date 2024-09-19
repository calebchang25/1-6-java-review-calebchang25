package gr11review.part1;

import java.io.*;

public class Review1 {
    public static void main(String[] args) throws IOException {
        // Initializing BufferedReader
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Obtaining input
        System.out.print("Enter the month number: "); 
        int Month = Integer.parseInt(input.readLine()); 
        System.out.print("Enter the day number: ");
        int Day = Integer.parseInt(input.readLine());
        int monthValue = 0;
        // Logic for determining days
        for (int x = 1; x < Month; x++) {
            monthValue += (x + ((x >= 8)?1:0)) % 2 * 31 + (x + ((x >= 8)?0:1)) % 2 * 30 - ((x == 2)?2:0);
            /*
             * Breakdown of the above code:
             * 
             * (x+((x>=8)?1:0))%2*31
             * Preforms n%2 then multiplies the result by 31. If n is <= 8, the code uses n+1 instead of n.
             * Returns 0 for 2,4,6,9,11
             * Returns 31 for 1,3,5,7,8,10,12
             * 
             * + (x+((x>=8)?0:1))%2*30
             * This is the same as the prior section of code, but the logic is inverted and the result is multiplied by 30 instead of 31.
             * Returns 0 for 1,3,5,7,8,10,12
             * Returns 30 for 2,4,6,9,11
             * 
             * - ((x==2)?2:0)
             * If the number is 2(Febuary), subtracts 2 to make the result 28.
             * Returns -2 for 2
             * Returns 0 for 1,3,4,5,6,7,8,9,10,11,12
             * 
             */
        }
        System.out.println(monthValue + Day);

        // Array solution:

        // int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        // int sum = 0;
        // for(int x = 0; x < Month; x++){
        //     sum += months[x];
        // }
        // System.out.println(sum+Day);
    }
}