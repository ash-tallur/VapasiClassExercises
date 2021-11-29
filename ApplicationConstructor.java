public class ApplicationConstructor {
    public static void main(String[] args) {
        /*
         Student sani = new Student();

         sani.studentDetails();

         Student ash = new Student("ash",1,45);
         ash.studentDetails();
         ash.checkIfStudentPassedOrFailed();
*/

/*
         Student[] arr;
         arr = new Student[3];

         arr[0] = new Student("ash",1,30);
         arr[1] = new Student("tallur",2,10);
         arr[0].studentDetails();
         arr[1].studentDetails();
*/

        Student[] arr;
        arr = new Student[3];

        arr[0]  = new Student();
        arr[1] = new Student();

        arr[0].setData("sed",1,2);
        arr[1].setData("we",3,90);
        arr[2].setData("er",4,56);

        for(int i=0;i<arr.length;i++){
            Student.noOfStudents +=1;
        }

        System.out.println(Student.noOfStudents);


    }
}
