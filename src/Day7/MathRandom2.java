package Day7;

public class MathRandom2 {
    // task 2 : print 2 random numbers between 0 and 10;
    //ex: 4
    //    5
    public static void main(String[] args) {

      double S1  =Math. random();
        System.out.println(S1);
        System.out.println(S1 * 10);
        double S2 = Math. random();
        System.out.println(S2);
        //1 WAY
        System.out.println((int)Math.random()*10);
        System.out.println((int)Math.random()*10);
        //WAY 2
        int max =10;
        double r1 = Math.random()*max;
        int i1 = (int)r1;
        System.out.println(i1);
        double r2 =Math.random()*max;
        int i2 = (int)r2;
        System.out.println(i2);



    }
}
