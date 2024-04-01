import java.util.Scanner;

public class Faktorial04 {

    public int num;

    public int factorialBf(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * factorialBf(n - 1); 
        }
    }
    

    public int factorialDC(int n){
        if (n==1){
            return 1;
        }
        else {
            int fakto = n * factorialDC(n-1);
            return fakto;
        }
    }
}