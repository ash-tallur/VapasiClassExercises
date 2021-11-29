import java.util.Scanner;

public class IfELse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();
        System.out.println("Enter another num");
        int b = sc.nextInt();
        if(b%a==0){
            System.out.println("It is divisible");
        }
        else{
            System.out.println("It is not divisible");
        }
    }
}
