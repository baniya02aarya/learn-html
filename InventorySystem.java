//Inventory system: Design a class-based inventory system where classes like product,order, and customer are created with constructtor and encapsulation.
// Product class
class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters (Encapsulation)
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Customer class
class Customer {
    private int customerId;
    private String name;
    private String email;

    // Constructor
    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Order class
class Order {
    private int orderId;
    private Customer customer;
    private Product product;
    private int quantity;

    // Constructor
    public Order(int orderId, Customer customer, Product product, int quantity) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    // Calculate total
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    // Display order summary
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + getTotalPrice());
    }
}

// Main class to test
public class InventorySystem {
    public static void main(String[] args) {
        // Create product
        Product product = new Product(101, "Laptop", 800.0);

        // Create customer
        Customer customer = new Customer(1, "Alice", "alice@example.com");

        // Create order
        Order order = new Order(5001, customer, product, 2);

        // Display order
        order.displayOrder();
    }
}
