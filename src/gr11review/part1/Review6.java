package gr11review.part1;
import java.text.DecimalFormat;
import java.io.*;
public class Review6{
    static double price = 0;
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        price = 0;
        input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        getMoney();
        System.out.println("Subtotal: " + money.format(price));
        System.out.println("Tax: " + money.format(price*0.13));
        System.out.println("Total: " + money.format(price*1.13));
    }
    
    public static void getMoney() throws IOException {
        System.out.print("Enter the price for an item: ");
        double moneyAmount = Double.parseDouble(input.readLine());
        price += moneyAmount;
        if(moneyAmount != 0){
            getMoney();
        }
    }
}