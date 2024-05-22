package InventoryManagementSysytem;

import StudentManagementSysytem.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class InventoryManagementSystem {
    public ArrayList<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
    }

    // Update the quantity of an existing product
    public boolean updateProductQuantity(int productID, int newQuantity) {
        for (Product product : products) {
            if (product.getProductID() == productID) {
                product.setQuantity(newQuantity);
                return true;
            }
        }
        return false;
    }

    // Remove a product from the inventory by productID
    public boolean removeProduct(int productID) {
        for (Product product : products) {
            if (product.getProductID() == productID) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    // Display all products sorted by their price in ascending order
    public void displayAllProductsSortedByPrice() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        for (Product product : products) {
            System.out.println(product);
        }
    }
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nInventory Management System Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product Quantity");
            System.out.println("3. Remove Product");
            System.out.println("4. Display All Products Sorted by Price");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Product
                    System.out.print("Enter product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    ims.addProduct(new Product(id, name, quantity, price));
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    // Update Product Quantity
                    System.out.print("Enter product ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    if (ims.updateProductQuantity(updateId, newQuantity)) {
                        System.out.println("Product quantity updated successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    // Remove Product
                    System.out.print("Enter product ID to remove: ");
                    int removeId = scanner.nextInt();
                    if (ims.removeProduct(removeId)) {
                        System.out.println("Product removed successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    // Display All Products Sorted by Price
                    System.out.println("All products sorted by price:");
                    ims.displayAllProductsSortedByPrice();
                    break;
                case 5:
                    // Exit
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

