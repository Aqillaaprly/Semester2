import java.util.Scanner;

public class MainStudent04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of Student ");
        int amountStudent = scanner.nextInt();

        SearchStudent04 data = new SearchStudent04(amountStudent);

        System.out.println("===================================================");
        System.out.println("Input student data accordingly from smallest NIM ");
        for(int i = 0; i < amountStudent; i++) { 
            System.out.println("================================");
            System.out.print("NIM \t :");
            int nim = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name \t :");
            String name = scanner.nextLine(); 
            System.out.print("Age \t :");
            int age = scanner.nextInt();
            System.out.print("GPA \t :");
            double gpa = scanner.nextDouble();

            Student04 std = new Student04(nim, age, name, gpa);
            data.add(std);
        }
        System.out.println("==========================================");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("==========================================");
        System.out.println("______________________________________________");
        System.out.println("Search by NIM :");
        int search = scanner.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);
        data.showPosition(search, position);
        data.showData(search, position);

        System.out.println();
        System.out.println("Sorting Data");
        data.bubbleSort();
        data.display();

        System.out.println("==========================================");
        System.out.println("______________________________________________");
        System.out.println("Search by NIM :");
        int search1 = scanner.nextInt();
        System.out.println("Using Binary Search");
        int position1 = data.findBinarySearch(search,0, amountStudent -1);

        data.showPosition(search1, position1);
        data.showData(search1, position1);

        System.out.println("____________________________");
        System.out.println("____________________________");
        System.out.print("Search student by Name: ");
        String searchName = s1.nextLine();
        System.out.println("Using Sequential Search by Name");
        int positionByName = data.findByNameSeqSearch(searchName);
        data.showPositionByName(searchName, positionByName);
        data.showData(searchName, positionByName);
    }


}
