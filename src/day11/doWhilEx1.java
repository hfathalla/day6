package day11;

import java.util.Scanner;

public class doWhilEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1;
        while (i <= 5) {
            System.out.println("while hi");
            i++;
        }

        //do-while loop
        int j = 1;
        do {
            System.out.println("do-while Hi");
            j++;
        } while (j <= 5);

        System.out.println("do-while Hi 2");
    }
}





