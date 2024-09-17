package gr11review.part1;
public class Review8{
        static int multi = 75;
        static int add = 74;
        static int modNum = 65537;
        static int seed = (int)System.currentTimeMillis();
    public static void main(String[] args){
        int[] randomValues = new int[3];
        int sum = 0;
        for(int x = 0; x < 1000; x++){
            for(int y = 0; y < 3; y++){
                randomValues[y] = random();
            }
            if(randomValues[0] == randomValues[1] && randomValues[0] == randomValues[2]){
                sum++;
            }
            System.out.print(randomValues[0] + " " + randomValues[1] + " " + randomValues[2]);
            System.out.println();
        }
        System.out.println(sum);
    }

    public static int random(){
        seed = (multi*seed+add) % modNum;
        return(seed%10);
    }
}