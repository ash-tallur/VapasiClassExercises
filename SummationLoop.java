/* Program to find the sum of 100 numbers */
public class SummationLoop {
    public static void main(String[] args) {
        int sum = 0;
        //for loop logic
//       for(int iteration = 0;iteration<=100;iteration++){
//            sum = sum + iteration;
//        }

        //while loop logic
//        int i = 0;
//        while(i<=100){
//            sum = sum + i;
//            i++;
//        }

        //do while logic
//           int iterate = 0;
//           do{
//               sum = sum +iterate;
//           }while(iterate<=100);

        //Sum of even numbers
        for (int i = 0; i <= 100; i++) {
            if ((i % 2) == 0) {
                sum = sum + i;
            }
        }

        System.out.println("The sum of 100 numbers is " + sum);
    }
}
