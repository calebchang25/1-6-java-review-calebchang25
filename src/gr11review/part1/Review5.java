package gr11review.part1;
import java.io.*;
public class Review5{
    public static void main(String[] args) throws IOException{
        // Set up input
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Get user input for yearly invested amount, intrest rate, and target amount.
        System.out.print("Enter the yearly invested amount: ");
        double yearlyAmount = Double.parseDouble(input.readLine());
        System.out.print("Enter the compound interest rate: ");
        double intrestRate = Double.parseDouble(input.readLine())/100;
        System.out.print("Enter the target amount: ");
        double targetAmount = Double.parseDouble(input.readLine());

        /* Equation for interest rate by year. Derived through 7 hours of staring at Desmos.
         * https://www.desmos.com/calculator/p19okzbmky
         * The conditional of (interestRate == 0) simulates the limit as i --> 0. 
         * Faster than original code, becomes better as final value increases and yearlyAmount/intrestRate decreases
         * For an example, test the code with 0.001 per year, 0.001 interest and 1000000 target
         */
        double yearsTaken = ((intrestRate==0)?(targetAmount/yearlyAmount):Math.log(1+((intrestRate*(targetAmount+yearlyAmount))/yearlyAmount))/Math.log(1+intrestRate)-1); 
        

        // Ceil rounds up, int prevents a decimal. If just casted to int, it would round down.
        System.out.println("The target amount will be earned in " + (int)Math.ceil(yearsTaken) + " years.");
    }
}