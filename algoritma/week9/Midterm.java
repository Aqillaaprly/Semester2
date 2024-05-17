import java.util.Scanner;



public class Midterm {
    String name, category;
    int stock, itemCode;
    Scanner sc = new Scanner(System.in);

    public Midterm(int itemCode, String name, String category, int stock) {
        this.itemCode = itemCode;
        this.name = name;
        this.category = category;
        this.stock = stock;
    }

    public int getItemCode() {
        return itemCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void print() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + name);
        System.out.println("Item Category: " + category);
        System.out.println("Item Stock: " + stock);
    }
}
