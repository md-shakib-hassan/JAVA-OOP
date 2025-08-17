import java.lang.classfile.instruction.StackInstruction;

public class Access_Modifier {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 25);

        s1.showdetails();

        System.out.println("Name: "+s1.name);
        System.out.println("ID: "+s1.id);
       // System.out.println("cgpa: "+s1.cgpa);
        System.out.println("age: "+s1.age);

    }
}
class Student{

    public String name;
    int id;
    private double cgpa;
    protected int age;




    public Student(String nam, int id){
        this.name=nam;
        this.id=id;
    }

    void showdetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("cgpa: "+cgpa);
        System.out.println("age: "+age);
    }
}
