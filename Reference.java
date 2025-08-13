public class Reference {
    public static void main(String[] args) {

        Student s1 = new Student("bob",45);
        Student s2 = new Student("hob",25);

        // s1.name="bod";
        // s1.id=45;

        // s2.name="hob";
        // s2.id=25;

        s1.showdetails(s2);


    }
    
}
 class Student {

    String name;
    int id;

    Student(String nam, int id){
        name=nam;
        this.id=id;


    }

    void showdetails(Student obj){
        System.out.println("name: "+obj.name);
        System.out.println("id: "+obj.id);
    }

    
}
