/* Program to find smallest of 4 numbers */

import java.util.Scanner;

public class Smallest4Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // resolve the conflict
        System.out.println("Enter 4 numbers to find smallest");
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter seconnd number");
        int num2 =sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        System.out.println("Enter fourth number");
        int num4 = sc.nextInt();

        //Using ternary operator 4,2,0,3
       // int smallest = (num1<num2 && num2<num3 && num3<num4)? num1:((num2<num3&&num2<num4)?num2:(num3<num4?num3:num4));
        int smallest = num1; // 4
        if(smallest > num2)
            smallest = num2;  // 2
        if(smallest > num3)
            smallest = num3; // 0
        if(smallest > num4)
            smallest = num4;  // 0

        /* Using if else if condition
        int smallest;
        if(num1<num2 && num2<num3 && num3<num4){
             smallest = num1;
        }
        else if(num2<num3&&num2<num4){
             smallest = num2;
         }
         else if(num3<num4){
             smallest = num3;
         }else {
             smallest = num4;
         }
         */

        System.out.println("The smallest of 4 numbers is " + smallest);

    }
}
