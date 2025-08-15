public class Multiple_class {
        public static void main(String [] args){

            Student s1 = new Student("Bob",35);
            Student s2 = new Student("Fab", 43);
            Student s3 = new Student("David",56);

            Course c1 = new Course("SPL 101", "Structure Programming Language");
            Course c2 = new Course("STAT109");

            s1.addcourse(c1);
            s1.addcourse(c2);

            s1.showdetails();

            s2.addcourse(c1);
            s2.addcourse(c2);

            s2.showdetails();



        }
}

class Student{
    public String name;
    public int id;
    public Course[] courses = new Course[5];

    public int coursecount=0;

     
    public Student(String nam, int id){
        name = nam;
        this.id=id;
        
    }
    void addcourse(Course c){
        courses[coursecount]=c;
        coursecount++;

    }

    void showdetails(){
        System.out.println("name: "+name);
        System.out.println("id: "+id);
      for(int i=0; i<coursecount; i++){
        System.out.println(courses[i].code);
        System.out.println(courses[i].title);
      }
    }
}

 class Course{
    public String title;
    public String code;
    
    public Course(String c, String t){
        this.title=t;
        this.code=c;

    }

    public Course(String c){
        this.code=c;
        title="not yet";

    }


}