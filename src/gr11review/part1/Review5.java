package gr11review.part1;
import java.io.*;
public class Review5{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the yearly invested amount: ");
        double yearlyAmount = Double.parseDouble(input.readLine());
        System.out.print("Enter the compound interest rate: ");
        double intrestRate = Double.parseDouble(input.readLine())/100;
        intrestRate = ((intrestRate==0)?0.000001:intrestRate); // Lim as interestRate --> 0
        System.out.print("Enter the target amount: ");
        double targetAmount = Double.parseDouble(input.readLine());
        double yearsTaken = Math.log(1+((intrestRate*(targetAmount+yearlyAmount))/yearlyAmount))/Math.log(1+intrestRate)-1; // Equation for interest rate by year. Derived through 7 hours of Desmos.
        System.out.println("The target amount will be earned in " + (int)Math.ceil(yearsTaken) + " years.");
    }
}