import java.util.Scanner;

public class MainStudent04 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        studentlist04 data = new studentlist04();
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print("Name = ");
            String name = s2.nextLine();
            System.out.print("Entrance year = ");
            int year = s1.nextInt();
            System.out.print("Age = ");
            int age = s1.nextInt();
            System.out.print("GPA = ");
            double gpa = s1.nextDouble();

            student04 s = new student04(name, year, age, gpa);
            data.add(s);
        }

        System.out.println("Unsorted student list:");
        data.print();

        System.out.println("Sorting data based on GPA:");
        data.bubbleSort();
        data.print();

        System.out.println("Ascending Sorted student list:");
        data.selectionSort();
        data.print();

        System.out.println("Ascending Sorted student list:");
        data.insertionSort(true);
        data.print();

        System.out.println("Decending Sorted student list:");
        data.insertionSort(false);
        data.print();
    }
}
