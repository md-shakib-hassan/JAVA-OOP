
public class OnlineShopping {
    public static void main(String[] args) {
        
        Product[] products = new Product[3];

        products[0] = new Product("Laptop", 75000.50, 1);
        products[1] = new Product("Mouse", 1200.75, 2);
        products[2] = new Product("Keyboard", 3000.25, 1);

        double cartTotal = 0;

        
        for (int i = 0; i < products.length; i++) {
            double productTotal = products[i].totalPrice();
            System.out.println(products[i].getName() + " Total Price: " + productTotal);
            cartTotal += productTotal;
        }

        System.out.println("-------------------------");
        System.out.println("Cart Total: " + cartTotal);
    }
}

// Product.java
class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total price for this product
    public double totalPrice() {
        return price * quantity;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}
