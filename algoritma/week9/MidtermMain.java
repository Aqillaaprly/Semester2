import java.util.Scanner;

public class MidtermMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stock stock = new Stock(9); 

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Sort Items by Stock");
            System.out.println("4. Display Food Items with No Stock");
            System.out.println("5. Search Item by Name");
            System.out.println("6. Add Stock for an Item");
            System.out.println("7. Decrease Stock for an Item");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Input item data:");
                    System.out.print("Enter item code: ");
                    int itemCode = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter item category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter item stock: ");
                    int stockQty = sc.nextInt();
                    sc.nextLine(); 
                    stock.addItem(new Midterm(itemCode, name, category, stockQty)); 
                    break;

                case 2:
                    stock.print();
                    break;

                case 3:
                    stock.bubbleSort();
                    System.out.println("Items sorted by stock:");
                    stock.print();
                    break;

                case 4:
                    System.out.println("Food items with no stock:");
                    stock.displayItemsWithNoStock();
                    break;

                case 5:
                    System.out.print("Enter name keyword to search: ");
                    String keyword = sc.nextLine();
                    int index = stock.searchItemByName(keyword);
                    if (index != -1) {
                        System.out.println("Item found at index " + index);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter item code to add stock: ");
                    int codeToAdd = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter quantity to add: ");
                    int quantityToAdd = sc.nextInt();
                    sc.nextLine(); 
                    stock.addStock(codeToAdd, quantityToAdd);
                    break;

                case 7:
                    System.out.print("Enter item code to decrease stock: ");
                    int codeToDecrease = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter quantity to decrease: ");
                    int quantityToDecrease = sc.nextInt();
                    sc.nextLine(); 
                    stock.decreaseStock(String.valueOf(codeToDecrease), quantityToDecrease);
                    break;

                case 8:
                    System.out.println("Exiting program.");
                    System.exit(0); 
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
