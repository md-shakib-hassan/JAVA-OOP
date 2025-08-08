public class Instance_method {
    public static void main(String[] args){
           Car c1 = new Car();
           Car c2 = new Car();
           c1.color="Red";
           c1.Country="UAE";
           c1.Details();//instance method call
            c1.Modified(1999);
    }
    
}
class Car{
    String color;
    String Country;
   public void Details(){   //instance method 
    System.out.println(color+" "+Country);
   }
   public void Modified(int n){
    System.out.println(n+"year modified");
   }
}