package Day7;

public class MathRandom {
    public static void main(String[] args) {
        //RANDOM NUMBER
        System.out.println(Math.random());
        int min = 50;
        int max = 100;
        int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println(randomInRange);

      String v6 = "160.95";
       double price = Double.valueOf(v6);
//        //range 1 - 10
      double quantity = randomInRange;
//
//        boolean checkingPrice = price * quantity == 321.9;
        // todo task1 : print random number betwen 0 and 100
        int max2 = 100;
        double r2 = randomInRange * max;
        int i2 = (int)r2;
        System.out.println(r2);
        System.out.println(i2);
        System.out.println( (int) Math.random()*100);
        //task2 : print 2 random number between 0 and 10 ;









    }
}
