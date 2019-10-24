package Day7;

import java.util.Scanner;

public class UserInputtask5 {
    public static void main(String[] args) {
       // Scanner star =new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();



        if("zero".equalsIgnoreCase(s1)){
            System.out.println(0);
        }
        if(s1.equals("one")){
            System.out.println(1);
        }
        if(s1.equals("two")){
            System.out.println(2);
        }
        if(s1.equals("three")) {
            System.out.println(3);
        }

        }
}
