package gr11review.part1;
import java.io.*;
public class Review1{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the month number: ");
        int Month = Integer.parseInt(input.readLine());
        System.out.print("Enter the day number: ");
        int Day = Integer.parseInt(input.readLine());
        int monthValue = 0;
        for(int x = 1; x < Month; x++){
            monthValue += (x+((x>=8)?1:0))%2*31 + (x+1+((x>=8)?1:0))%2*30 - ((x==2)?2:0);
        }
        System.out.println(monthValue+Day);
    }
}