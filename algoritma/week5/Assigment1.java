import java.util.Scanner;

public class Assigment1 {
    public String nameStd;
    public int scoreAssigment, scoreQuiz, scoreMid, scoreFinal;

    void showData(){
        System.out.println("Nama :" +nameStd);
        System.out.println("Assigment :" +scoreAssigment);
        System.out.println("Quiz :" + scoreQuiz);
        System.out.println("Midterm :" + scoreMid);
        System.out.println("Final  :" + scoreFinal);
    }

    double calculateTotalScore (double score11, double score22, double score33, double score44){
    return (score11*30/100)+(score22*20/100)+(score33*20/100)+(score44*30/100);
    }
}
