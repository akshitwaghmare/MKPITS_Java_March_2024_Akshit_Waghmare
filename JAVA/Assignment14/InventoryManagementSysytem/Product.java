package InventoryManagementSysytem;

public class Product {
    private int productID;
    private String name;
    private int quantity;
    private double price;

    public Product(int productID, String name, int quantity, double price) {
        this.productID = productID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
