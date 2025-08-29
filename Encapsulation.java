public class Encapsulation{

    public static void main(String[] args){

        Personalinfo p1 = new Personalinfo("Shakib", 25);

        Personalinfo p2 = new Personalinfo("Hasib", 01);

        p1.setId(14);
        p1.setName("Ritu");

        System.out.println(p1.getName());

        System.out.println(p1.getID());

        p2.showdetali();

        p1.showdetali();


    }

}

class Personalinfo{
    private String name;
    private int id ;

    Personalinfo(String nm, int id){
        name = nm;
        this.id=id;

    }

    void setId(int i){
       if(i>0){
        id=i;
       }
       else{
        System.out.println("Invalid number");
       }
    }

       int getID(){
        return id;
    }

    void showdetali(){
        System.out.println("Name: "+name);
        System.out.println("id : "+id);
    }

    void setName(String nm){
        name=nm;
    }
    String getName(){
        return name;
    }



}