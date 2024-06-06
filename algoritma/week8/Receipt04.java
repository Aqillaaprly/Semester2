public class Receipt04 {
    int size, top;
    Receipt04[] data;
    String Id;
    int quantity;
    double price;
    String date;

    public Receipt04(String Id, int quantity, double price, String date) {
        this.Id = Id;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }

    // Constructor for the stack
    public Receipt04(int size) {
        this.size = size;
        data = new Receipt04[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(Receipt04 dt) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        data[top] = dt;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Remove data: " + data[top].Id + " | " + data[top].quantity + " | " + data[top].price + " | " + data[top].date);
        top--;
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + data[top].Id + " | " + data[top].quantity + " | " + data[top].price + " | " + data[top].date);
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack contents:");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].Id + " | " + data[i].quantity + " | " + data[i].price + " | " + data[i].date);
        }
        System.out.println();
    }

    void clear() {
        top = -1;
    } 
}