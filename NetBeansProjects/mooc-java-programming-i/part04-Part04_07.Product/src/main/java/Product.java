public class Product {
    
// fields
    
private double price;
private int quantity;
private String name;

// constructor

public Product(String initialName, double initialPrice, int initialQuantity) {
    
    this.name = initialName;
    this.quantity = initialQuantity;
    this.price = initialPrice;
    
    
    
    
}

// method

public void printProduct() {
    
    System.out.println(name + ", " + "price "  + price + ", "  + quantity + " pcs");
    
    
    
}




}
