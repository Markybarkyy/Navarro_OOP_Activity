package employee.version1;

public class BasePlusCommissionEmployee {
	private int empID;
    private String empName;
    private String saleType;
    private MyDate empDateHired;
    private MyDate empBirthDate;
    private double totalSales;
    private double salary;
    private double baseSalary;
    public BasePlusCommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }
    public BasePlusCommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }
    
    
    public BasePlusCommissionEmployee() {

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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        if (totalSales < 50000) {
            salary = (totalSales * 0.05) + baseSalary;
            saleType = "Low Sales";
        } else if (totalSales >= 50000 && totalSales < 100000) {
            salary = (totalSales * 0.20) + baseSalary;
            saleType = "Typical Sales";
        } else if (totalSales >= 100000 && totalSales < 500000) {
            salary = (totalSales * 0.30) + baseSalary;
            saleType = "Typical Sales";
        } else if (totalSales >= 500000) {
            salary = (totalSales * 0.50) + baseSalary;
            saleType = "High Sales";
        }

        return salary;
    }

    public void displayInfo() {
        System.out.printf("total: Php %.2f, %s for this quarter.total salary(base salary included of Php %.2f): Php %.2f", totalSales, saleType, baseSalary, salary);
    }


    @Override
    public String toString() {
        return "\n\nID: " + 
        		this.empID + "\nName: " +
        		this.empName + "\nDate Hired: " + 
        		this.empDateHired + "\nBirth Date: " + 
        		this.empBirthDate;
    }
}
