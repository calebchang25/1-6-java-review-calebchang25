package gr11review.part1;

import java.io.*;

public class Review2 {
    public static void main(String[] args) throws IOException {
        // BufferedReader initialization
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // Jokes list
        String[] jokes = {
                "Why did the barber come first in the race to finish cutting hair the fastest? This was because he had taken a short cut!",
                "What was the foot's favorite type of chips? Dori-toes",
                "What metal can you use to make leggings? Tightanium",
                "Why did the teacher wear sunglasses? Because his class was so bright!" };

        //Printing out the menu and prompt
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");

        // Getting user input
        int Number = Integer.parseInt(input.readLine());

        // Printing out the correct joke, or the invalid menu option error.
        System.out.print(((Number <= 3)?jokes[Number]:"") + ((Number >= 4)?"Invalid menu option":""));



        // Switch case solution:
        // switch(Number){
        //     case 0: 
        //         System.out.println("Why did the barber come first in the race to finish cutting hair the fastest? This was because he had taken a short cut!");
        //         break;
        //     case 1: 
        //         System.out.println("What was the foot's favorite type of chips? Dori-toes");
        //         break;
        //     case 2: 
        //         System.out.println("What metal can you use to make leggings? Tightanium");
        //         break;
        //     case 3: 
        //         System.out.println("Why did the teacher wear sunglasses? Because his class was so bright!");
        //         break;
        //     default: 
        //         System.out.println("Invalid menu option");
        //         break;

        // }

    }
}