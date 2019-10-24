package day11;

import java.util.Scanner;

public class WhileTask4 {
    public static void main(String[] args) {
        // part3. check text if it's only uppercase print "use lowercase letters"
        // Hint: line.toUpperCase();
//        //       line.equals();
//        // part4. check text if it's only lowercase print "use uppercase letters"
        Scanner scanner =new Scanner(System.in);

       while (true) {
           System.out.println("Write a text: ");
            String line = scanner.nextLine();
          if (line.equals("quit")) {
                break;
            }

            // part1. check for the #, @, $, * symbols also for a strong password
            // hint: fill if statement with conditions
            if (line.contains("#") || line.contains("@") || line.contains("$") || line.contains("*")) {
                System.out.println("Strong Password");
                // part2. continue part1, if your text does not contain
                //        those symbols, it should print "weak password"
            } else {
                System.out.println("Weak Password");
            }


            // part3. check text if it's only uppercase print "use lowercase letters"
            // Hint: line.toUpperCase();
            //       line.equals();

            //"ABCDEFG" == "ABCDEFG"
            String lineUpperCase = line.toUpperCase();
            if (line.equals(lineUpperCase)) {
                System.out.println("use lowercase letters");
            }
            // part4. check text if it's only lowercase print "use uppercase letters"

        }

        }
}
