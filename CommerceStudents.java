public class CommerceStudents extends ParentStudent{
    float accounts;
    float economics;
    float businessStudies;

    CommerceStudents(String name,int rollNum,float accounts,float economics,float businessStudies){
     //   this.name = name;
        //  this.rollNum = rollNum;
        super(name,rollNum);
        this.accounts = accounts;
        this.economics = economics;
        this.businessStudies = businessStudies;
    }
    void displayCommerceMarks(){
        System.out.println("Name" + name);
        System.out.println("Roll num"+rollNum);
        System.out.println("accounts" + accounts);
        System.out.println("economics" + economics);
        System.out.println("business studies" + businessStudies);
    }
}
