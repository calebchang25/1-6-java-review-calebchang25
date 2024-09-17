package gr11review.part1;
import java.io.*;
public class Review5{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the yearly invested amount: ");
        double yearlyAmount = Double.parseDouble(input.readLine());
        System.out.print("Enter the compound interest rate: ");
        double intrestRate = Double.parseDouble(input.readLine())/100;
        System.out.print("Enter the target amount: ");
        double targetAmount = Double.parseDouble(input.readLine());
        double yearsTaken = ((intrestRate==0)?(targetAmount/yearlyAmount):Math.log(1+((intrestRate*(targetAmount+yearlyAmount))/yearlyAmount))/Math.log(1+intrestRate)-1); 
        /*Equation for interest rate by year. Derived through 7 hours of Desmos. 
          Conditional of interestRate == 0 simulates the limit as i --> 0. 
          Doing it this way shortens to 1 equation instead of potentially thousands of repititions*/
        System.out.println("The target amount will be earned in " + (int)Math.ceil(yearsTaken) + " years.");
    }
}