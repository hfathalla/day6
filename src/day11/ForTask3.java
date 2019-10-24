package day11;

import java.util.Scanner;

public class ForTask3 {
    public static void main(String[] args) {
      //  task 3

        // write a program with sum up to you provided number from 0
        //5
        // 0 + 1 + 2 +3 +4 +5 = > ???
// part 2
        Scanner s = new Scanner(System.in);
        System.out.println("provide a max number :");
        int  max = s .nextInt();
        int sum = 0 ;
        int counter= 0;
        for (int i =0; i<=  max ; i ++  ){
            System.out.println(i);
            sum += i;
            counter++;
        }
        //part1
        System.out.println("sum s " + sum);
        //part 2 is to get average
        System.out.println(" average is " + (double)sum/counter);
    }

}

