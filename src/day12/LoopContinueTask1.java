package day12;

public class LoopContinueTask1 {
    public static void main(String[] args) {
       //   for (int i = 1; i <= 10; i++){
            //TODO if number is even continue
            //     else print that number
            //ex: 3 => print "number is 3"
            //ex: 2 => continue;
            //Hint: number%2==0 => even
            //write you code here
//           if (i%2== 0) {
//               continue;
//           }else{
//               System.out.println("Number is "+i);
//           }
//               System.out.println("Iteration " + i);
              for (int i = 1; i <= 5; i++) {
                  System.out.println("Start of iteration " + i);
                  if (i < 3) {
                      continue;
                  }
                  //end of you code
                  System.out.println("End of iteration " + i);

           }
    }
}



