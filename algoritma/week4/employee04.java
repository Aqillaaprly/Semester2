public class employee04 {
    String name;
    int age;
    int livingAllowance, transportationAllowance;
    double[] salary = new double[3];

    public employee04(String na, int ag, double[] sal, int la, int ta) {
        name = na;
        age = ag;
        salary = sal;
        livingAllowance = la;
        transportationAllowance = ta;
    }

    double averageSalary() {
        return totalSalary() / 3.0;
    }

    double totalSalary() {
        double total = 0;
        for (double sa : salary) {
            total += sa;
        }
        return total;
    }
    double averageAllowence(){
        return transportationAllowance+livingAllowance/2.0;
    }

    void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + totalSalary()); 
        System.out.println("Living Allowance: " + livingAllowance);
        System.out.println("Transportation Allowance: " + transportationAllowance);
        System.out.println("Average " +averageAllowence());
    }
}
