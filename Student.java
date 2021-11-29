/*Student class */
public class Student {

    String name;
    int rollNum;
    float marks;
    static int noOfStudents=0;

    Student(){
        this.marks = 0.0F;
        //noOfStudents +=1;
    }
    Student(String name,int rollNum,float marks){
       this.name = name;
       this.rollNum = rollNum;
       this.marks = marks;
       //noOfStudents +=1;
    }

    void setData(String name,int rollNum,float marks){
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }

    void studentDetails(){
        System.out.println("Name" + name);
        System.out.println("Roll num " +rollNum);
        System.out.println("Marks" +marks);
        System.out.println("Students list " + Student.noOfStudents);
    }
    void checkIfStudentPassedOrFailed(){
        if(marks>35 && marks<55) {
            System.out.println("Student passed in second class with" + marks);
        }
        else if(marks>55 && marks<70){
            System.out.println("Student passed in first class with" + marks);
        }
        else if(marks>70 && marks<=100){
            System.out.println("Student passed in distinction class with" + marks);
        }
        else if(marks<35){
            float failedBy = 0.0F;
            failedBy = 35-marks;
            System.out.println("Student failed by " + failedBy);
        }
    }
}
