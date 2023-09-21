package employee.version1;

import java.util.Date;

public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    @Override
    public double computeSalary() {
        double commission = ratePerPiece * totalPiecesFinished;
        if (totalPiecesFinished > 100) {
            int bonus = (totalPiecesFinished / 100) * 10;
            commission += bonus * ratePerPiece;
        }
        return commission;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate per Piece: " + ratePerPiece);
        System.out.println("Total Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + ", totalPiecesFinished=" + totalPiecesFinished + ", ratePerPiece=" + ratePerPiece;
    }
}
