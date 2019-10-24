package day8;
import java.util.Scanner;

public class IfElse5 {
    public static void main(String[] args) {
        // byte -127 <-> 128
        // write a program check what number datatype it is?
        // 23 => byte
        // 12312 => int
        // 123123123 => long

        Scanner scan = new Scanner(System.in);

        System.out.println("Write a number please:");
        long number = scan.nextLong();

        if(number >= -128 && number <= 127){
            System.out.println("DataType is byte");

        }else if (number >= -32768 && number <=32767){
            System.out.println(" data type is short");
        }else if ( number >=Integer .MAX_VALUE && number <= Integer.MIN_VALUE){
            System.out.println("data type is int");

        }else if (number >=- 922337203687755808L && number <=Long. MAX_VALUE){
            System.out.println("data type is Long ");
        }

    }


}


