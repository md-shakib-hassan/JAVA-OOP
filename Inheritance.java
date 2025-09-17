public class Inheritance{
    public static void main(String[] args){
        Student s1 = new Student();
        SEstudent p1 = new SEstudent("Hasib","JH001M", 3.98);
        p1.workShop();
        p1.everyOne();

    }
}

class Student{
    String name;
    String id;
    double cg;

    void doClass(){
        System.out.println("Every Student Do Class.");
    }

    void everyOne(){
        System.out.println("Everyone to be very successfull in life.");
    }
}

class SEstudent extends Student{

    SEstudent(String name, String id, double cg){
        this.name=name;
        this.id=id;
        this.cg=cg;
    }

    void workShop(){
        System.out.println("They are very excited to do project.");
    }

    void lab(){
        System.out.println("They doing everyday lap.");
    }

}