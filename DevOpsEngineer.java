public class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + getTotalSalary());
    }

    public static void main(String[] args) {
    DevOpsEngineer devOpsEngineer = new DevOpsEngineer("John Doe", 1001, 80000, 5000);
    devOpsEngineer.displayEmployeeDetails();
}
}