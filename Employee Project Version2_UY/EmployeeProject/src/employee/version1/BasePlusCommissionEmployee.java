package employee.version1;

import java.util.Date;

public class BasePlusCommission extends Employees {
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommission(int empID, String empName, Date empDateHired, Date empBirthDate, double commissionRate, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate);
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double computeSalary() {
        return (commissionRate * getSales()) + baseSalary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + ", commissionRate=" + commissionRate + ", baseSalary=" + baseSalary;
    }
}
