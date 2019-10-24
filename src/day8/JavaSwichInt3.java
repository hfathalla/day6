package day8;
import java.util.Scanner;
// Task 2 / Homework:
// Continue task 1, but do opposite
// Monday => 1
// Tuesday => 2
// Sunday => 7
public class JavaSwichInt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide a day betwwn Monday -Sunday");

        String day = scanner.nextLine();
        switch (day) {
            case "Monday":
                System.out.println("1");
                break;
            case " Tusday":
                System.out.println("2");
                break;
            case " Wednesday":
                System.out.println("3");
                break;
            case " Tursday":
                System.out.println("4");
                break;
            case " Friday":
                System.out.println("5");
                break;
            case " Saturday":
                System.out.println("6");
                break;
            case " Sunday":
                System.out.println("7");
            default:
                System.out.println("not in range");
                break;


        }


    }
}

