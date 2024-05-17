public class Stock {
    Midterm[] itemList = new Midterm[9];
    int idx = 0;

    public Stock(int size) {
        itemList = new Midterm[size];
        for (int i = 0; i < size; i++) {
            itemList[i] = new Midterm(0, "", "", 0); 
        }
    }


    // Method to manage stock, renamed as per Java naming convention
    public void stockManagement(int itemAmount) {
        itemList = new Midterm[itemAmount];
    }

    // Method to add an item
    public void addItem(Midterm item) {
        if (idx < itemList.length) {
            itemList[idx] = item;
            idx++;
        } else {
            System.out.println("All in Stock");
        }
    }
   
    // Method to print items
    public void print() {
        for (Midterm item : itemList) {
            if (item != null) { 
                item.print();
                System.out.println("==========================================================");
            }
        }
    }

    // Method to sort items by stock
    public void bubbleSort() {
        for (int i = 0; i < itemList.length - 1; i++) {
            for (int j = 0; j < itemList.length - i - 1; j++) {
                if (itemList[j].stock < itemList[j + 1].stock) {
                    Midterm tmp = itemList[j];
                    itemList[j] = itemList[j + 1];
                    itemList[j + 1] = tmp;
                }
            }
        }
    }

    // Method to display items with no stock
    public void displayItemsWithNoStock() {
        for (Midterm item : itemList) {
            if (item != null && item.getCategory().equalsIgnoreCase("food") && item.getStock() == 0) {
                item.print(); 
            }
        }
    }
    
    // Method to search item by name
    public int searchItemByName(String name) {
        for (int i = 0; i < itemList.length; i++) {
            if (itemList[i] != null && itemList[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Method to add stock for an item
    public void addStock(int itemCode, int quantity) {
        for (Midterm item : itemList) {
            if (item != null && item.getItemCode() == itemCode) {
                item.setStock(item.getStock() + quantity);
                return;
            }
        }
        System.out.println("Item with code " + itemCode + " not found.");
    }
    
    // Method to decrease stock for an item
    public void decreaseStock(String itemCode, int quantity) {
        for (Midterm item : itemList) {
            if (item != null && String.valueOf(item.getItemCode()).equals(itemCode)) {
                if (item.getStock() >= quantity) {
                    item.setStock(item.getStock() - quantity);
                } else {
                    System.out.println("Insufficient stock for item with code " + itemCode);
                }
                return;
            }
        }
        System.out.println("Item with code " + itemCode + " not found.");
    }
}
