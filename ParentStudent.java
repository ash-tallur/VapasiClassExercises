public class ParentStudent {
    String name;
    int rollNum;


    ParentStudent(String name,int rollNum){
        this.name = name;
        this.rollNum = rollNum;
    }
   void StudentDetails(){
       System.out.println("Student name" + name);
   }
}
