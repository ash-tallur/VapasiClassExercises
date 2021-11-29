import java.util.Scanner;
/*Take input from user based on it say the day of the week*/
public class DayWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day");
        int day = sc.nextInt();

        if(day >30 || day<1){
            System.out.println("Enter valid date");
        }
        else {
            int remainder = day%7;
            if(remainder ==1){
                System.out.println("Day is Monday");
            }
            else if(remainder==2){
                System.out.println("Day is Tuesday");
            }
            else if(remainder==3){
                System.out.println("Day is WEdnesday");
            }
            else if(remainder==4){
                System.out.println("Day is Thursday");
            }
            else if(remainder == 5){
                System.out.println("Day is Friday");
            }
            else if(remainder ==6){
                System.out.println("Day is saturday");
            }
            else if(remainder ==0){
                System.out.println("day is sunday -holiday");
            }
            else{
                System.out.println("Invalid");
            }
        }


    }
}
