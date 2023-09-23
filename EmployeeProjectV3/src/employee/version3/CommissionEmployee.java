package employee.version3;

public class CommissionEmployee extends Employee{
	private double totalSales;
    private String saleType;


    

    public CommissionEmployee(int empID, Ename empName, MyDate empDateHired, MyDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }
    public CommissionEmployee(int empID, Ename empName, MyDate empDateHired, MyDate empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    
    
    
    
    public CommissionEmployee() {

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
            saleType = "low sales";
        } else if (totalSales >= 50000 && totalSales < 100000) {
            salary = totalSales * 0.20;
            saleType = "typical sales";
        } else if (totalSales >= 100000 && totalSales < 500000) {
            salary = totalSales * 0.30;
            saleType = "typical sales";
        } else if (totalSales >= 500000) {
            salary = totalSales * 0.50;
            saleType = "high sales";
        }
        return salary;
    }

    public void displayInfo() {
        double catcher = computeSalary();
        System.out.println("Employee total: " + totalSales + " you have " + saleType + " this quarter." + 
        "\nEmployee total salary: " + catcher);
    }


    @Override
    public String toString() {
        return super.toString() +"\nTotal sales: " + this.totalSales;
    }
}
