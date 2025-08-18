import java.util.*;
public class EmplyoeeAttendance{
    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2 = new Employee();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Day of Present for first person: ");
        e1.totalWorkingDays=25;
        e1.name="SAKIB";
        e1.id=25;

        int days = input.nextInt();
        e1.markAttendance(days);

        System.out.print("Enter Day of Present for Second person: ");
        int days2 = input.nextInt();
        e2.name="hasib";
        e2.id=1;
        e2.markAttendance(days2);
        e2.totalWorkingDays=25;
        
        e1.display();
        System.out.println("\n\n");
        e2.display();
        


    }
}

 class Employee{
    String name;
    int id;
    int dayPresent;
    int totalWorkingDays;
    double result;

    void markAttendance(int days ){
        dayPresent=days;

    }

    double attendancePercentage(){
         result = ((double)dayPresent/totalWorkingDays)*100;
        return result;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("id "+id);
        System.out.println("dayPresent: "+dayPresent);
        System.out.println("totalWorkingdays: "+totalWorkingDays);
        System.out.println("Percentage: "+attendancePercentage()+"%");
    }


}