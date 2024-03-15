public class employeemain004 {
    public static void main(String[] args) {
        int n = 3;
        employee04[] employee = new employee04[n];

        employee[0] = new employee04("Employee 1", 36, new double[]{5000000, 5500000, 6500000}, 250000, 500000);
        employee[1] = new employee04("Employee 2", 36, new double[]{6000000, 6000000, 5000000}, 200000, 100000);
        employee[2] = new employee04("Employee 3", 37, new double[]{6000000, 5500000, 5500000}, 100000, 500000);

        for (employee04 emp : employee) {
            emp.printData();
        }

        // Find max salary
        double maxSalary = employee[0].totalSalary();
        int maxIdx = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].totalSalary() > maxSalary) {
                maxSalary = employee[i].totalSalary();
                maxIdx = i;
            }
        }
        System.out.println("=======================================");
        System.out.println("Employee with the max salary:");
        employee[maxIdx].printData();
    }
}
