package gr11review.part1;
public class Review8{
        static int multi = 75;
        static int add = 74;
        static int modNum = 65537; // 2^16+1
        // Initial seed set as the current time to give variation between runs.
        static int seed = (int)System.currentTimeMillis();
    public static void main(String[] args){

        // Initializing variables
        int[] randomValues = new int[3];
        int sum = 0;

        // 1000 random lines of slots
        for(int x = 0; x < 1000; x++){
            // Setting the values
            for(int y = 0; y < 3; y++){
                randomValues[y] = random();
            }

            // Recording the values
            if(randomValues[0] == randomValues[1] && randomValues[0] == randomValues[2]){
                sum++;
            }

            // Outputing the values, then printing a new line
            System.out.print(randomValues[0] + " " + randomValues[1] + " " + randomValues[2]);
            System.out.println();
        }
        // Outputing the sum
        System.out.println(sum);
    }


    // Simple pseudo-random function used in many places. Values from wikipedia.
    public static int random(){
        seed = (multi*seed+add) % modNum;
        return(seed%10); // %10 so it returns 1 digit
    }
}