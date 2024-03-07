public class Student04 {
    String nim, name, gender;
    double GPA;

    Student04(String ni, String na, String jk, double gpa){
        nim = ni;
        name = na;
        gender = jk;
        GPA = gpa;
    }

    void print(){
        System.out.println("NIM = "+nim);
        System.out.println("Nama = "+name);
        System.out.println("Jenis Kelamin = "+gender);
        System.out.println("GPA = "+GPA);
    }
}