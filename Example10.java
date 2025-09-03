public class Example10 {
    public static void main(String[] args) {

        Laptop l1= new Laptop();
        Laptop l2= new Laptop("Hp");
        Laptop l3= new Laptop("Dell","16 GB");
        Laptop l4= new Laptop("Hp Victus","32GB",100000.00);

        l1.showSpecs();
        l2.showSpecs();
        l3.showSpecs();
        l4.showSpecs();
        
    }
}
class Laptop{
    String band;
    String ram;
    double price;

    Laptop(){
        band="Unknown";
        ram="4 GB";

    }

    Laptop(String band){
        this.band=band;
    }

    Laptop(String band, String ram, double price){
        this.band=band;
        this.ram=ram;
        this.price=price;
    }

    Laptop(String band, String ram){
        this.band=band;
        this.ram=ram;
    }

    void showSpecs(){
        System.out.println(band+" "+ram+" "+price);
    }

}