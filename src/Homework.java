
import java.util.Scanner;
public class Homework {

// Task 2 / Homework:
// Continue task 1, but do opposite
// Monday => 1
// Tuesday => 2
// Sunday => 7


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek =scanner.nextInt();

        switch (dayOfWeek){
            case 1:
            System.out.println(" monday");
            break;

            case 2:
            System.out.println(" Tusday");
        }
    }


}
