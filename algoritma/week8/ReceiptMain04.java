import java.util.Scanner;
import java.util.Random;

public class ReceiptMain04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random r = new Random();

        Receipt04 rstack = new Receipt04(8);

        char choose;

        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int stackOption = sc.nextInt();  

            switch (stackOption) {
                case 1:
                    do {
                        int numbers = rstack.top + 1;
                        Receipt04 rs = new Receipt04(
                                "R" + (1000 + r.nextInt(2000)),
                                r.nextInt(1, 100),
                                r.nextDouble() * (5000.0 - 1000.0) + 1000.0,
                                "2024-01-01" 
                        );
                        rstack.push(rs);
                        System.out.println("Added random receipt " + numbers);
                        System.out.print("Do you want to add another receipt? (y/n): ");
                        choose = sc.next().charAt(0);
                    } while (choose == 'y');
                    break;
                case 2:
                    rstack.pop();
                    break;
                case 3:
                    rstack.peek();
                    break;
                case 4:
                    rstack.print();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (true); 
    }
}

