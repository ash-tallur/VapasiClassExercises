public class PolyExercise {
    public void doSomething(int val){
        System.out.println("This is integer");
    }
    public void doSomething(String val){
        System.out.println("This is string");
    }

    public static void main(String[] args) {
        PolyExercise obj = new PolyExercise();
        obj.doSomething(1);
        obj.doSomething("as");
    }
}
