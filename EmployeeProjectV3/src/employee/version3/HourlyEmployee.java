package employee.version3;

public class HourlyEmployee extends Employee{
	private float totalHoursWorked;
    private float ratePerHour;

     

    public HourlyEmployee(int empID, Ename empName, MyDate empDateHired, MyDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public HourlyEmployee(int empID, Ename empName, MyDate empDateHired, MyDate empBirthDate, int totalHoursWorked, float ratePerHour) {
    	super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee() {

    }
    
    
    
    

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {

         double retVal;

            if(this.totalHoursWorked > 40) {
                retVal = (40 * this.ratePerHour) + ((this.totalHoursWorked - 40)*(this.ratePerHour + (this.ratePerHour * 0.50)));
            }
            else {
                retVal = this.totalHoursWorked * this.ratePerHour;
            }

            return retVal;
    }

    public void displayInfo() {
        System.out.printf("Hours worked: %.2f"
        		+ "\nEmployee Rate Per Hour: %.2f "
        		+ "\nEmployee Total income: %.2f",totalHoursWorked,ratePerHour,computeSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmployee Total hours worked: " + this.totalHoursWorked + 
        		"\nEmployee Rate per hour: " + this.ratePerHour;
    }
}
