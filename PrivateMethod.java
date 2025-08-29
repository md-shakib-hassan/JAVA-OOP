public class PrivateMethod {
    public static void main(String[] args){
        Dubaicar c1 = new Dubaicar("Ferrari","12f79");
        Dubaicar c2 = new Dubaicar("Bugatti","BGm15");

         c1.finalDetail();
       


    }
}

class Dubaicar{
    private String name;
    private String numberP;

   public Dubaicar(String nm, String numberP){
        name = nm;
       this.numberP = numberP;
    }

    private void showdetail(){
        System.out.println("Band: "+name);
    }

    public void finalDetail(){
        showdetail();
        System.out.println("Number: "+numberP);
    }




}
