package AbstractionExercise;

public class ExceptionExercise {
    public static void main(String[] args) {
        try{
            int a =100;
            int b=0;
            int c= a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Number cannot be divided zero");
        }


    }
}
