package gr11review.part1;
import java.io.*;
public class Review7{
    // Couldn't fuigure out how to do without string methods.
    public static void main(String[] args) throws IOException{
        // Initializes variables, then gets word input
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String wordInput = input.readLine();
        int count[] = new int[3];

        // Adds 1 to each of the counts for every time that the character at the current possition is correct
        for (int x = 0; x < wordInput.length(); x++){
            count[0] += (wordInput.charAt(x) == 32?1:0);
            count[1] += (wordInput.charAt(x) == 65 || wordInput.charAt(x) == 97?1:0);
            count[2] += ((x+1)%2 == 1 && wordInput.charAt(x) != 32?1:0);
        }

        // Prints the final result
        System.out.println("There are " + wordInput.length() + " characters in the sentence.");
        System.out.println("There are " + count[0] + " spaces in the sentence.");
        System.out.println("There are " + count[1] + " letter a in the sentence.");
        
        // Loop to print out the dashes
        for(int x = 0; x < count[2]; x++){
            System.out.print("-");
        }
    }
}