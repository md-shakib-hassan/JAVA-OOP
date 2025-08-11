public class Constructor_OverL {
    public static void main(String[] args){
        Student s1 = new Student("Asad",25);
        Student s2 = new Student("Asif",99);
        Student s3 = new Student();

        s1.showdetail();
        s2.showdetail();
        s3.showdetail();


    }
    
}
// for one object there we will be work on indiviual constructor.
 class Student{
    int id ;
    String Name;

    public Student(String Name, int id){
        this.Name=Name;
        this.id = id;
        
         System.out.println("For Constructor Call.\n");

    }
    public Student(){
        System.out.println("For Constructor Without parameter.\n");
    }
    void showdetail(){
        System.out.println(Name+" "+id);
    }

}