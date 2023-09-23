package employee.version3;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;


    

    public BasePlusCommissionEmployee(int empID, Ename empName, MyDate empDateHired, MyDate empBirthDate) {
    	super(empID, empName, empDateHired, empBirthDate);
    }

    public BasePlusCommissionEmployee(int empID, Ename empName, MyDate empDateHired, MyDate empBirthDate, double totalSales, double baseSalary) {
    	super(empID, empName, empDateHired, empBirthDate);
        this.baseSalary = baseSalary;
    }
    
    
    
    
    
    public BasePlusCommissionEmployee() {

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        double salary = super.computeSalary();

        salary += baseSalary;

        return salary;
    }


    @Override
    public String toString() {
        return super.toString() + "\nEmployee Base salary: " + this.baseSalary;
    }
}
