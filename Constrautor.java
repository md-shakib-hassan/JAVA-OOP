public class Constrautor{
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.roll=25;
        s1.name="Shakib";

        s2.roll=9;
        s2.name="Idk";

        s1.showdetails();
        s2.showdetails();


        
    }
}
class Student {
    int roll;
    String name;
     
    void showdetails(){
        System.out.println(name+" "+roll);

    }

   public Student(){
    System.out.println("How are you all?");

    }

    
}