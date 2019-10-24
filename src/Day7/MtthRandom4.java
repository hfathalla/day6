package Day7;

public class MtthRandom4 {


    //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
    public static void main(String[] args) {
        int min = -200;
        int max = 200;
        int range = max - min;
        int randomInRange = min + (int) (Math.random() * (range + 1));

        //task2;
        // check if random number is positive or negative
        //where numbwe is -200<=n =200
        //ex : -123 => negative
        //ex: 10 => positive
        if (randomInRange < 0) {
            System.out.println("it is negative ");
            if (randomInRange > 0) {
                System.out.println(" it is positive");

                if (randomInRange == 0) {
                    System.out.println(" it is zero");


                }
            }
        }


    }
}