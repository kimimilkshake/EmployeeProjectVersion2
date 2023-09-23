package employee.version3;

public class EmployeeProject {

    public static void main(String[] args) { 
        HourlyEmployee h1 = new HourlyEmployee(27, "Kirzteen", new MyDate(27,6,2002), new MyDate(27,6 ,2000), (float) 38.2, 100);
        
        HourlyEmployee h2 = new HourlyEmployee();
        
        PieceWorkerEmployee pw1 = new PieceWorkerEmployee(28, "Kirzleen", new MyDate(12,2,2017), new MyDate(19,9,1988), 350, 10);
        
        CommissionEmployee ce1 = new CommissionEmployee(29, "Kirzly", new MyDate(11,12,2021), new MyDate(17,4,1989), 75000);
        
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(30, "Kirzion", new MyDate(1,2,2019), new MyDate(6,12,1991), 100000, 5000);
        
        h1.displayInfo();
        
        h2.displayInfo();
        
        pw1.displayInfo();
        
        ce1.displayInfo();
        
        bpce1.displayInfo();
    }
    
}