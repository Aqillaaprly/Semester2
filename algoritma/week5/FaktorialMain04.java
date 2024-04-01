import java.util.Scanner;

public class FaktorialMain04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("Input the number of elements you want to count : ");
        int elemen = sc.nextInt();

        Faktorial04[] fk = new Faktorial04[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial04();
            System.out.println("Input the data value to- " + (i + 1) + ": ");
            fk[i].num = sc.nextInt();
        }
        System.out.println("=======================================================");
        System.out.println("Factorial Results with Brute Force ");
        for (int i = 0; i < elemen; i++) {
            long startTime = System.currentTimeMillis();
            int resultBf = fk[i].factorialBf(fk[i].num);
            long endTime = System.currentTimeMillis();
            System.out.println("Factorial of value " + fk[i].num + " is : " + resultBf);
            System.out.println("Execution time (Brute Force): " + (endTime - startTime) + " milliseconds");
        }
        System.out.println("=======================================================");
        System.out.println("Factorial Results with Divide and Conquer ");
        for (int i = 0; i < elemen; i++) {
            long startTime = System.currentTimeMillis();
            int resultDc = fk[i].factorialDC(fk[i].num);
            long endTime = System.currentTimeMillis();
            System.out.println("Factorial of value " + fk[i].num + " is : " + resultDc);
            System.out.println("Execution time (Divide and Conquer): " + (endTime - startTime) + " milliseconds");
        }
        System.out.println("=======================================================");
    }
}
