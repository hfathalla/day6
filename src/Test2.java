import java.util.Random;

public class Test2 {


    public
    static void main(String[] args) {

//           int x = 10, y = 20;
//          if (x < y) {
//              if (x > y) {
//                  System.out.println("HELLO TECHNO");
//               } else {
//
//               }
//           }


        // }
////Output:
////1. HELLO TECHNO
////2. Compile time error
////3. WELCOME
////4. No Output

  //      Scanner scan  = new Scanner (System.in);

      System.out.println("Please enter the number of the day");
        Random scan = new Random();
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday is Weekday");
                break;

            case 2:
                System.out.println("Tuesday is Weekday");
                break;

            case 3:
                System.out.println("Wednesday is Weekday");
                break;

            case 4:
                System.out.println("Thursday is Weekday");
                break;

            case 5:
                System.out.println("Friday is Weekday");
                break;

            case 6:
                System.out.println("Saturday is Weekend");
                break;

            case 7:
                System.out.println("Sunday is Weekend");
                break;

            default:
                System.out.println("Invalid input");
        }

    }
}