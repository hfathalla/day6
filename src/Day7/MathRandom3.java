package Day7;

public class MathRandom3 {

//printing number in range




    //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
    public static void main(String[] args) {
        int min = 0;
        int max = 3;
        int range = max - min;

        int randomInRange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInRange);

        //.write a program that prints word representation of random number n
        //where number is 0<=n <=3
        // ex 0 =>zero
        if (randomInRange ==0) {
            System.out.println("zero");
        }
        if (randomInRange ==1) {
            System.out.println("one");
        }
            if (randomInRange ==2) {
                System.out.println("tow");

        }

            if (randomInRange== 3){
                System.out.println(" three");

            }
        }
    }

