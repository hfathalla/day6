package day11;
import java .util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        //        for(int i = 1; i <= 5; i++){
//            System.out.println(i);
//        }

        //     int i = 1;
        //     while (i <= 5) {
        //          System.out.println(i);
        //      i++;
//            Scanner scan = new Scanner(System.in);
//
//            System.out.println("Write a string");
        //         String s = scan.nextLine();
//
        //         while (!s.equals("o")) { //s != "exit"
        //            System.out.println("Write a string");
        //           s = scan.nextLine();

        //part1 , write a program which ask you to provide a task
        // and should stop when you type "quite"
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a string");
        String s = scan.nextLine();

        while (!s.equals("quite")) { //s != "exit"
            System.out.println("Write a string");
            s = scan.nextLine();
            //part 2 continue part1  but also check for length  () of string
            // if length is bigger than 10, program should say that string is too  large
            //ex :
            //in the while loop.....
            // wjherjwhejrhwejrh => "string is too large"

                while (s.length() > 10) {
                    System.out.println("string is too large ");
                    s = scan.nextLine();

                    //part 3 continue part2 , if provided string is equal to you name
                    //program should print your surname







                }

        }
    }
}