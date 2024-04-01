public class student04 {
    String name; 
    int entranceYear, age;
    double gpa;

    student04 (String n, int y, int a, double g){
        name = n;
        entranceYear = y;
        age = a;
        gpa = g;
    }
    
    void print (){
        System.out.println("Name =" +name);
        System.out.println("Entrance year =" +entranceYear);
        System.out.println("Age =" +age);
        System.out.println("GPA =" + gpa);
    } 
}