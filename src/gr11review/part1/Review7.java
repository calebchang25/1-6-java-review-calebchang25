package gr11review.part1;
import java.io.*;
public class Review7{
    // Cant do without string methods
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String wordInput = input.readLine();
        int count[] = new int[3];
        for (int x = 0; x < wordInput.length(); x++){
            count[0] += (wordInput.charAt(x) == 32?1:0);
            count[1] += (wordInput.charAt(x) == 65 || wordInput.charAt(x) == 97?1:0);
            count[2] += ((x+1)%2 == 1 && wordInput.charAt(x) != 32?1:0);
        }
        System.out.println("There are " + wordInput.length() + " characters in the sentence.");
        System.out.println("There are " + count[0] + " spaces in the sentence.");
        System.out.println("There are " + count[1] + " letter a in the sentence.");
        for(int x = 0; x < count[2]; x++){
            System.out.print("-");
        }
    }
}