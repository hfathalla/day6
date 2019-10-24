package day8;
import javax.swing.*;
import java.util.Scanner;
public class IfElse6 {
    // evaluate reult of exam
    // 'A'=> excellent
    // 'B' => GOOD
    // 'C' => PASS
    //'D' => fail

    public static void main(String[] args) {
      Scanner scan = new Scanner ( System.in );
        System.out.println("provide a grade ");
        String grade = scan .nextLine();

        if ( grade .equals("A")) {
            System.out.println("excellent");
        }else if ( " B". equals(grade)){
            System.out.println("good ");

        }else if ( "C" .equals(grade)){
            System.out.println("pass");

        }else if ("F".equals(grade)){
            System.out.println(" fail ");
            //Task 2
            // continue task 1 but also check for B+, B-, C+, C-, D+, D-
            // ex:
            // B+ or B or B- => Good
            // C+ or C or C- => middle
            // D+ or D or D- => pass

            //


        }
    }
}