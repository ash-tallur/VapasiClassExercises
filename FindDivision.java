import java.util.Scanner;

public class FindDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");

        int marks = sc.nextInt();
        if(marks>=65 && marks<=75) {
            System.out.println("First");
        }else if(marks<35){
            System.out.println("fail");
        }else if(marks>=35 && marks<=64){
            System.out.println("second");
        }else if(marks>76){
            System.out.println("distinction");
        }
    }
}
