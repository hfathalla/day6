package day12;

import java.util.Random;
import java.util.Scanner;

public class RandomNomber {
    public static void main(String[] args) {
//        System.out.println("welcom to guess number game ");
//        Random rand = new Random();
//        int randomNumber = rand.nextInt(10);
//
//        Scanner scan = new Scanner(System.in);
//        int myNumber = -1;
//        int counter = 1;
//
//        while (myNumber != randomNumber) {
//
//            System.out.println("provide  number");
//            myNumber = scan.nextInt();
//
//
//            if (myNumber < randomNumber) {
//                System.out.println("Provide a greater number");
//            }
//
//                System.out.println("Provide a smaller num ");
//
//                    System.out.println(" you win the game");
//                    break;
//                }
//                if (counter == 3) {
//                    System.out.println(" you faild to guess a number ,sorry");
//                }
//
//
//                System.out.println("number was " + randomNumber);
//                counter++;
                // part 1
                //end loop if you failed to guess a number after 3 try
                //hint: counter ,break,if

                // part 2
                // fix if statment check numbers correctly

        System.out.println("Welcome to Guess a Number game!!!");
        Random rand = new Random();
        int randomNumber = rand.nextInt(10); // 0 -> 10

        Scanner scan = new Scanner(System.in);
        int myNumber = -1;

        int counter = 1;
        while (myNumber != randomNumber) {
            System.out.println("Provide number");
            myNumber = scan.nextInt();

            if (myNumber < randomNumber) {
                System.out.println("Provide a greater number");
            } else if (myNumber > randomNumber) {
                System.out.println("Provide a smaller number");
            } else if (myNumber == randomNumber) {
                System.out.println("You win the game");
                break;
            }

            if (counter == 3) {
                System.out.println("you failed to guess a number, sorry, better luck next time");
                break;
            }

            counter++;
        }

        System.out.println("Number was " + randomNumber);
    }
}



    //part1
    //  end loop if you failed to guess a number after 3 try
    // Hint: counter, break, if


    //part2
    //  fix if statements, check numbers correctly



