import java.util.Scanner;

public class MainSquared04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.print("Input the number of elements you want to count: ");
        int elemen = sc.nextInt();

        Squared04[] png = new Squared04[elemen];

        // Input values for num and squared using constructor
        for (int i = 0; i < elemen; i++) {
            System.out.print("Input the value to be squared to- " + (i + 1) + ": ");
            int num = sc.nextInt();
            System.out.print("Input the squared value to- " + (i + 1) + ": ");
            int squared = sc.nextInt();
            png[i] = new Squared04(num, squared);
        }

        // Menu for selecting method
        System.out.println("=============================================================");
        System.out.println("Select the method to calculate squared:");
        System.out.println("1. Brute Force Squared");
        System.out.println("2. Divide and Conquer Squared");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Perform calculation based on user choice
        switch (choice) {
            case 1:
                System.out.println("Result with Brute Force Squared");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is :"
                            + png[i].squaredBF(png[i].num, png[i].squared));
                }
                break;
            case 2:
                System.out.println("Result with Divide and Conquer Squared");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is :"
                            + png[i].squaredDC(png[i].num, png[i].squared));
                }
                break;
            default:
                System.out.println("Invalid choice. Please select either 1 or 2.");
        }
    }
}
