import java.util.Scanner;

public class MainAssigment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input How Many Student :");
        int std = sc.nextInt();
        Assigment1[] scr = new Assigment1[std];
        double totalScore =0;

        for (int i = 0; i < std; i++) {
            scr[i] = new Assigment1();
            System.out.println("Input Name : ");
            scr[i].nameStd = sc.next();
            System.out.println("Input Assigment Score : ");
            scr[i].scoreAssigment = sc.nextInt();
            System.out.println("Input Quiz Score : ");
            scr[i].scoreQuiz = sc.nextInt();
            System.out.println("Input Midterm Score : ");
            scr[i].scoreMid = sc.nextInt();
            System.out.println("Input Final Score : ");
            scr[i].scoreFinal = sc.nextInt();
            System.out.println(" ");

            double studentTotalScore = scr[i].calculateTotalScore(scr[i].scoreAssigment, scr[i].scoreQuiz, scr[i].scoreMid, scr[i].scoreFinal);
            totalScore += studentTotalScore;
        }

        System.out.println("===============================================================");
        for (int i = 0; i < std; i++) {
            System.out.println("Student -" + (i + 1));
            scr[i].showData();
        }

        System.out.println("===============================================================");
        for (int i = 0; i < std; i++) {
            Assigment1 scrr = new Assigment1();
            System.out.println("Student -" +(i+1));
            System.out.println("Final Score is :" + scr[i].calculateTotalScore(scr[i].scoreAssigment, scr[i].scoreQuiz, scr[i].scoreMid, scr[i].scoreFinal));
            System.out.println("===============================================================");
        }

        double averageScore = totalScore / std;
        System.out.println("===============================================================");
        System.out.println("Average Score of all students: " + averageScore);
        System.out.println("===============================================================");
    }
}
