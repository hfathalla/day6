package day12;

import java.util.Random;

public class LoopBreak {
    public static void main(String[] args) {
//        int number = 0;
//        for (int i = 1; i<=10; i++){
//         //   System.out.println(i);
//         if (i == 5 ){
//             number = i ;
//             break;
//
//         }
//        }
//        System.out.println("your number is " + number);
//
//        // run loop up to 100000000,
//        //and exit that loop when i is equal to 232558
//
//        ;// WAY1
        Random rand = new Random();
       int someRandomNumber = rand .nextInt(100);
//        // WAY2
//        int someRandomNumber1 = (int) (Math.random()*100000000);

           int number = -1;

        for (int i = 1;i<=100; i++){
            System.out.println("i");
            if (i == someRandomNumber){
                System.out.println("--------");
                number = i;
                break;

            }
        }
        System.out.println("your number is " +number);

        // part2, continue part1, but instead of 232558 use some random number
        // using random generator, Math.random, Random



        }
}
