package day11;
import java. util.Scanner;
public class ForEx1 {
    public static void main(String[] args) {
     //   Scanner scan = new Scanner(System. in);
    //    System.out.println("provide a number");
     //   int num = scan. nextInt();


      //  for (int i = 1; i<= num; i++){
       //     System.out.println(i);
      //  }

//      Task 1 write a program that take two number
        //from console, and show multiplication up to that "a" number
        //ex a =3, b=2
        //2 => 2* 1
        //4 => 2*2
        //6 => 2* 3
        // hint : use homeworkloops and exercise above
        Scanner scan = new Scanner(System. in);
        System.out.println("provide a");

        int a = scan. nextInt();
        System.out.println(" provid b");
        int b = scan.nextInt();


        for (int i  = 1;i<= 10;i++ ){
            System.out.println(b*i);
            System.out.println(a*i);
        }


    }
}
