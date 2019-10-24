package day8;
import java .util.Scanner;
public class IfElse7 {
    //Task 2
    // continue task 1 but also check for B+, B-, C+, C-, D+, D-
    // ex:
    // B+ or B or B- => Good
    // C+ or C or C- => middle
    // D+ or D or D- => pass

    //
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println( " provide grade[A,B,C,D,F ");
        String grade = scan .nextLine();

        if ( grade. equals("B+ ")||grade.equals("B")||grade.equals("B-")){
            System.out.println("good");

        }else if (grade.equals("C+" )||grade.equals("C")||grade.equals("C-")){
            System.out.println("middle");

        }else if (grade.equals("D") ||grade.equals("C")||grade.equals("C-")){

            System.out.println("pass");

        }
    }
}
