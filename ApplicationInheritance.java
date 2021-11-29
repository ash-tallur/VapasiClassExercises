public class ApplicationInheritance {
    public static void main(String[] args) {
        ScienceStudents ash = new ScienceStudents("ash",34,67,12,32);
        ash.displayMarks();

        CommerceStudents tallur = new CommerceStudents("Tallur",12,34,12,34);
        tallur.displayCommerceMarks();
    }
}
