package employee.version3;

public class Employee {
	private int empID;
    private Ename empName;
    private MyDate empDateHired;
    private MyDate empBirthDate;



public Employee(int empID, Ename empName, MyDate empDateHired, MyDate empBirthDate) {
    this.empID = empID;
    this.empName = empName;
    this.empDateHired = empDateHired;
    this.empBirthDate = empBirthDate;
}






public Employee() {

}

public Employee(int empID, Ename empName) {
    this.empID = empID;
    this.empName = empName;
}

public int getEmpID() {
    return empID;
}

public void setEmpID(int empID) {
    this.empID = empID;
}

public Ename getEmpName() {
    return empName;
}

public void setEmpName(Ename empName) {
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

@Override
public String toString() {
    return "\n\n\nEmployee ID: " + this.empID + 
    		"\nEmployee Name: " + this.empName + 
    		"\nEmployee Date Hired: " + this.empDateHired + 
    		"\nEmployee Birth Date: " + this.empBirthDate;
}
}
