public class ScienceStudents extends ParentStudent{
    float physics;
    float chemistry;
    float math;

    ScienceStudents(String name,int rollNum,float physics,float chemistry,float math){
        //remember to put super in the first line always
        super(name, rollNum);
   //     this.name = name;
        //    this.rollNum = rollNum;
        this.physics = physics;
        this.chemistry = chemistry;
        this.math = math;

    }
    void displayMarks(){
        System.out.println("Name" + name);
        System.out.println("Roll num"+rollNum);
        System.out.println("Physics" + physics);
        System.out.println("Chemistry" + chemistry);
        System.out.println("Math" + math);
    }

}
