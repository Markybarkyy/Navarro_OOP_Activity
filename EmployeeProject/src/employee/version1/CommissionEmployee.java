package employee.version1;

public class CommissionEmployee {
	private int empID;
	private double totalSales;
    private String empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private String sType;
    public CommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }
    public CommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }
    public CommissionEmployee() {

    }
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public MyDate getEmpDateHired() {
        return empDateHired;
    }
    public void setEmpDateHired(MyDate empDateHired) {
        this.empDateHired = empDateHired;
    }
    public MyDate getEmpBirthDate() {
        return empBirthDate;
    }
    public void setEmpBirthDate(MyDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }
    public double getTotalSales() {
        return totalSales;
    }
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    public double computeSalary() {

        double salary = 0;

        if (totalSales < 50000) {
            salary = totalSales * 0.05;
            sType = "Low sales";
        } else if (totalSales >= 50000 && totalSales < 100000) {
            salary = totalSales * 0.20;
            sType = "Typical sales";
        } else if (totalSales >= 100000 && totalSales < 500000) {
            salary = totalSales * 0.30;
            sType = "Typical sales";
        } else if (totalSales >= 500000) {
            salary = totalSales * 0.50;
            sType = "High sales";
        }
        return salary;
    }

    public void displayInfo() {
        double c = computeSalary();
        System.out.printf("total: Php %.2f, %s this quarter.\nYour total salary: Php %.2f", totalSales, sType, c);
    }
    @Override
    public String toString() {
        return "\n\n\nID: " + this.empID + 
        		"\nName: " + this.empName + 
        		"\nDate Hired: " + this.empDateHired + 
        		"\nBirth Date: " + this.empBirthDate +
        		"\nTotal sales: " + this.totalSales;
    }
}
