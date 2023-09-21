package employee.version1;

import java.util.Date;

public class CommissionEmployee extends Employees {
    private double totalSales;

    // Constructors
    public CommissionEmployee() {

    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = 0;
    }

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    // Setters and Getters
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    // Override the computeSalary method
    @Override
    double computeSalary() {
        double salary = 0;

        if (this.totalSales < 50000) {
            salary = this.totalSales * 0.05;
        } else if (this.totalSales >= 50000 && this.totalSales < 100000) {
            salary = this.totalSales * 0.20;
        } else if (this.totalSales >= 100000 && this.totalSales < 500000) {
            salary = this.totalSales * 0.30;
        } else if (this.totalSales >= 500000) {
            salary = this.totalSales * 0.50;
        }

        return salary;
    }

    // Override the displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Total Salary: " + computeSalary());
    }

    // Override the toString method
    @Override
    public String toString() {
        return super.toString() + ", totalSales=" + totalSales;
    }
}
