package employee.version1;

import java.util.Date;

public class HourlyEmployee extends Employees {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double hourlyRate, int hoursWorked) {
        super(empID, empName, empDateHired, empBirthDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    double computeSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + ", hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked;
    }
}
