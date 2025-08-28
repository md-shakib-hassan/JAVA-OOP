
class Product {
    String name;
    double price;
    double discountPercentage;

    Product(String n, double p, double dP) {
        name = n;
        price = p;
        discountPercentage = dP;
    }

    void calculateDiscountedPrice() {
        double discounted = price - (price * discountPercentage / 100);
        System.out.println(name + " Final Price: " + discounted);
    }
}

public class DiscountCalculator {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 50000, 10);
        p.calculateDiscountedPrice();
    }
}

