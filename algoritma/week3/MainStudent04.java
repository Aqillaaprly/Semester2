public class MainStudent04 {
    public static void main(String[] args) {
        Student04[] std = new Student04[3];
        double sum = 0;
        for(int i = 0; i < std.length; i++) {
            std[i] = new Student04("NIM" + i, "NAME" + i, "L", Math.random() * 10);
            std[i].print();
            sum = sum + std[i].GPA;
        }
        double rata2 = sum / std.length;
        System.out.println("Average GPA: " + rata2);

        double maxGPA = std[0].GPA; 
        int idx = 0;
        for(int i = 0; i < std.length; i++) {
            if(std[i].GPA > maxGPA) { 
                maxGPA = std[i].GPA; 
                idx = i;
            }
        }
        System.out.println("Student with highest GPA : ");
        std[idx].print();
    }
}
