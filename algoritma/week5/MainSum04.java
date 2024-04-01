import java.util.Scanner;

public class MainSum04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Program for calculating Total Profits");

        System.out.println("Input the number of companies: ");
        int numCompanies = sc.nextInt();
        Sum04[] companies = new Sum04[numCompanies];

        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Company " + (i + 1) + ":");
            System.out.println("Input the number of months for company " + (i + 1) + ":");
            int numMonths = sc.nextInt();
            companies[i] = new Sum04(numMonths);

            for (int j = 0; j < numMonths; j++) {
                System.out.print("Input the profit of month " + (j + 1) + " for company " + (i + 1) + ": ");
                companies[i].profit[j] = sc.nextDouble();
            }
        }

        System.out.println("Select the method to calculate total profits:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < numCompanies; i++) {
                    double totalProfit = companies[i].totalBF(companies[i].profit);
                    System.out.println("Total profits for company " + (i + 1) + " is: " + totalProfit);
                }
                break;
            case 2:
                for (int i = 0; i < numCompanies; i++) {
                    double totalProfit = companies[i].totalDC(companies[i].profit, 0, companies[i].elemen - 1);
                    System.out.println("Total profits for company " + (i + 1) + " is: " + totalProfit);
                }
                break;
            default:
                System.out.println("Invalid choice. Please select either 1 or 2.");
        }
    }
}
