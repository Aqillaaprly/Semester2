import java.util.Arrays;

public class Array1D04 {
    public static void main(String[] args) {
        int[] array = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};

        System.out.println("Unsorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        Arrays.sort(array);

        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int biggestValue = array[array.length - 1];
        System.out.println("Biggest Value: " + biggestValue);
        System.out.println("Position(s):");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == biggestValue) {
                System.out.println("Index " + i);
            }
        }

        int count = 0;
        for (int num : array) {
            if (num == biggestValue) {
                count++;
            }
        }
        System.out.println("Amount of biggest value: " + count);
    }
}
    

