package employee.version2;

public class PieceWorkerEmployee extends Employee{
	private int totalPiecesFinished;
    private float ratePerPiece;

   


    public PieceWorkerEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public PieceWorkerEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee() {

    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double computeSalary() {
        double retVal;

        if(this.totalPiecesFinished < 100) {
            retVal = this.totalPiecesFinished * this.ratePerPiece;
        }
        else {
            int temp = this.totalPiecesFinished / 100;
            retVal = (this.totalPiecesFinished * this.ratePerPiece) + (temp * (this.ratePerPiece * 10));

        }


        return retVal;
    }

    public void displayInfo() {
        System.out.printf("Employee Pieces finished: %d"
        		+ "\nEmployee Rate Per Piece: %.2f"
        		+ "\nEmployee Total income:  %.2f",totalPiecesFinished,ratePerPiece,computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee Total pieces finished: " + this.totalPiecesFinished + "\nEmployee Rate per piece: " + this.ratePerPiece;
    }
}
