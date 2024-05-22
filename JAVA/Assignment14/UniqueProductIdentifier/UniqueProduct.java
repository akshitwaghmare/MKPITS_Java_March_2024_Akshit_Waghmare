package UniqueProductIdentifier;

import InventoryManagementSysytem.Product;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueProduct {
    HashSet<String> hashSet = new HashSet<>();

    public void addProduct(String product){
        hashSet.add(product);
    }
    public void removeproduct(String removeproduct){
        if(hashSet.contains(removeproduct)){
            hashSet.remove(removeproduct);
            System.out.println("Product removed Successfully");
        }
        else {
            System.out.println("Product does not Exists");
        }
    }
    public void displayProducts(){
        if(hashSet.isEmpty()){
            System.out.println("No product found");
        }
        else
            System.out.println("Products : ");
            for (String product : hashSet){
                System.out.println(product);
            }
    }

    public static void main(String[] args) {
        UniqueProduct p = new UniqueProduct();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("UNIQUE PRODUCT IDENTIFIER MANAGER");
            System.out.println("1-Add Product");
            System.out.println("2-Remove Product");
            System.out.println("3-Dispaly Product");
            System.out.println("4-EXIT");

            System.out.println("Enter Choice");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Product To Add : ");
                    String product = scanner.next();
                    p.addProduct(product);
                    break;
                case 2:
                    System.out.println("Enter Product To Remove : ");
                    String rempooveproduct = scanner.next();
                    p.removeproduct(rempooveproduct);
                    break;
                case 3:
                    System.out.println("Products ----  ");
                    p.displayProducts();
                    break;
                case 4:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid Choice - Enter valid Choice");
                    break;
            }
        }
    }
}
