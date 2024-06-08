public class Students {
    String nim;
    String name;
    int classNumber;
    double gpa;

    public Students(String nim, String name, int classNumber, double gpa) {
        this.nim = nim;
        this.name = name;
        this.classNumber = classNumber;
        this.gpa = gpa;
    }

    public String toString() {
        return "NIM: " + nim + ", Name: " + name + ", Class: " + classNumber + ", GPA: " + gpa;
    }
}
