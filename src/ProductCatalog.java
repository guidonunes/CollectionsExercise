import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductCatalog {
    public static void main(String[] args) {
        Map<Integer, String> catalog = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int option;

        do {
            System.out.print("Main Menu: " +
                    "\n1. Add a product" +
                    "\n2. Remove a product" +
                    "\n3. Update a product" +
                    "\n4. Show products" +
                    "\n0. Exit" +
                    "\nChoose an option: ");
            option = sc.nextInt();
            sc.nextLine();

            int id;
            String name;

            switch(option) {
                case 1:
                    System.out.print("Enter an ID for the product (e.g.: 5): ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the product name: ");
                    name = sc.nextLine();
                    if(!catalog.containsKey(id)) {
                        catalog.put(id, name);
                    } else {
                        System.out.println("ID already exists.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the ID to be removed: (e.g.: 5): ");
                    id = sc.nextInt();
                    if(catalog.remove(id) != null) {
                        System.out.println("The product has been successfully removed.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter an ID to be updated: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter a new name for the product: ");
                    name = sc.nextLine();
                    if(catalog.containsKey(id)) {
                        catalog.put(id, name);
                        System.out.println("The product has been sucessfully updated");
                    } else {
                        System.out.println("Product not found");
                    }
                    break;
                case 4:
                    System.out.println("List of products: ");
                    for(Map.Entry<Integer, String> product : catalog.entrySet()) {
                        System.out.println("ID: " + product.getKey() + " - Name: " + product.getValue());
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while(option != 0);
        sc.close();
    }
}
