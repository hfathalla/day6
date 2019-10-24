package day12;

import java.util.Scanner;
// == sign -> equal
// != sign -> not equal
public class DoWhileEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int pin = 9999;
          do {
           System.out.println("your pin is " + pin);
        //    //task 1, check pin, pin should be 4 digit number
        // if it is not 4 digit number, print "incorrect pin"
        // hint: 999 < PIN < 10000
        // ex: 13123 => "incorrect pin"

         }while (pin !=9999);
          System.out.println("take you card");
    }
}


