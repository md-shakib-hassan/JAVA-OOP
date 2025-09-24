public class SuperKeyword {
    public static void main(String[] args) {
        Vechile v1 = new Vechile();

        Car c1 = new Car();

        c1.display();
        c1.color();

    }
}
class Vechile{
    int maxSpeed = 120;
    void color(){
        System.out.println("Green");
    }
}

class Car extends Vechile{
    int maxSpeed=180;

    void color(){
        System.out.println("Red");
        super.color();
    }
    void display(){
        System.out.println("speed: "+ maxSpeed+" "+" speedd: "+ super.maxSpeed);
    }
}