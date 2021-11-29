class EncapExercise {
    private int a;

    public int getA(){
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class Exam4{
    public static void main(String[] args) {
        EncapExercise ex = new EncapExercise();
        ex.setA(2);
        System.out.println(ex.getA());
    }
}
