import java.util.Scanner;

/* Create 2 methods - one for adding 2 numbers, other to add 3 numbers with same method name*/
public class SignatureMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");

        System.out.println("Enter 1st number");
        float num1 = sc.nextInt();

        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();

        int sum = add(num1,num2);
        int res = add(num1,num2,3);

        System.out.println("The result is " + res);
        System.out.println("The sum is" + sum);
    }

    static int add(float one,int two){
        int sum = (int) (one + two);
        return sum;
    }

    static int add(float one,int two,int three){
        int sum = (int) (one + two + three);
        return sum;
    }
}
