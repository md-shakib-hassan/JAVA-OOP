class HouseDetails {
    String color;
    String name = "Shakib";

    public void details() {
        System.out.println(color + " house is " + name);
    }
}

public class House {
    public static void main(String[] args) {
        HouseDetails h1 = new HouseDetails();
        HouseDetails h2 = new HouseDetails();

        h1.color = "red";
        h2.color = "white";

        h1.details(); // Outputs: red house is Shakib
    }
}
