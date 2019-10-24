package Day7;

public class MathRandom5 {

// Task 3:
// Check if random number is odd or even


    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        int range = max - min;
        int randomInRange = min + (int) (Math.random() * (range + 1));

        int x = randomInRange;
        System.out.println(x);
        if ((x % 2) == 0) {
            // even
            System.out.println("even");
        } else {
            // odd
            System.out.println("odd");
         // task4 write a program that sum  2 random integer number
         //ex: a = 10; b = 20
            //a+b = ????
            int a = (int)(Math.random()* 10);
            int b = (int)(Math.random()* 100);
            System.out.println(a);
            System.out.println(b);

            System.out.println(a + b);


        }
    }
}