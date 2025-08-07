public class Object{
    public static void main(String[] args){
        //Object variable_name = new Object();
        Student S1 = new Student();
        Student S2 = new Student();
        //assign name to object location
        S1.name = "Shakib";
        S1.Id = 25;
        System.out.println(S1.name);
        System.out.println(S1.Id);

    }
}
class Student{
    String name;//instance variable
    int Id;//instance variable
}