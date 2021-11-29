import java.util.Scanner;

/*Application class*/
public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // resolve the conflict

        Student ash = new Student();
        System.out.println("Enter student details");
        System.out.println("Enter name");
        ash.name = sc.nextLine();
        System.out.println("Enter roll number");
        ash.rollNum = Integer.parseInt(sc.nextLine());
        System.out.println("Enter marks");
        ash.marks = Float.parseFloat(sc.nextLine());
       // ash.marks = Float.parseFloat(sc.nextLine());

        ash.checkIfStudentPassedOrFailed();

        Student tallur = new Student();
        System.out.println("Enter 2nd student details");
        System.out.println("Enter name");
        tallur.name = sc.nextLine();
        System.out.println("Enter roll number");
        tallur.rollNum = sc.nextInt();
        System.out.println("Enter marks");
        tallur.marks = sc.nextFloat();

        tallur.checkIfStudentPassedOrFailed();

    }
}
