package employee.version3;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ename n1 = new Ename("Mark Angelo", "Encluna", "Navarro");
        Ename n2 = new Ename("Ken Benedict", "Encluna", "Navarro");
        Ename n3 = new Ename("Ferdie Navarro", "Edgecock", "Navarro");
        MyDate date1 = new MyDate(10,5,2002);
        MyDate date2 = new MyDate(7,8,2003);
        BasePlusCommissionEmployee Employee_A2 = new BasePlusCommissionEmployee();
        BasePlusCommissionEmployee Employee_B2 = new BasePlusCommissionEmployee(12361912, n2, date1, date2, 50000, 25000);
        BasePlusCommissionEmployee Employee_C2 = new BasePlusCommissionEmployee(21821518, n3, date1, date2);    
	    HourlyEmployee Employee1 = new HourlyEmployee();
	    HourlyEmployee Employee2 = new HourlyEmployee(12361912, n2, date1, date2, 50, 1000);
	    HourlyEmployee Employee3 = new HourlyEmployee(21821518, n3, date1, date2);
	    PieceWorkerEmployee Employee_A = new PieceWorkerEmployee();
        PieceWorkerEmployee Employee_B = new PieceWorkerEmployee(12361912, n2, date1, date2, 50, 1000);
        PieceWorkerEmployee Employee_C = new PieceWorkerEmployee(21821518, n3, date1, date2);
        CommissionEmployee Employee_A1 = new CommissionEmployee();
        CommissionEmployee Employee_B1 = new CommissionEmployee(12361912, n2, date1, date2, 50000);
        CommissionEmployee Employee_C1 = new CommissionEmployee(21821518, n3, date1, date2);
	        Employee1.setTotalHoursWorked(40);
	        Employee1.setRatePerHour(1000);
	        Employee1.setEmpID(12774712);
	        Employee1.setEmpName(n1);
	        Employee1.setEmpDateHired(date1);
	        Employee1.setEmpBirthDate(date2);
	        System.out.println(Employee1);
	        Employee1.displayInfo();
	        System.out.println(Employee2);
	        Employee2.displayInfo();
	        Employee3.setTotalHoursWorked(30);
	        Employee3.setRatePerHour(1000);
	        System.out.println(Employee3);
	        Employee3.displayInfo();
	        Employee_A.setEmpID(12774712);
	        Employee_A.setEmpName(n1);
	        Employee_A.setTotalPiecesFinished(100);
	        Employee_A.setRatePerPiece(1000);
	        Employee_A.setEmpDateHired(date1);
	        Employee_A.setEmpBirthDate(date2);
	        System.out.println(Employee_A);
	        Employee_A.displayInfo();
	        System.out.println(Employee_B);
	        Employee_B.displayInfo();
	        Employee_C.setTotalPiecesFinished(200);
	        Employee_C.setRatePerPiece(1000);
	        System.out.println(Employee_C);
	        Employee_C.displayInfo();
	        Employee_A1.setEmpID(12774712);
	        Employee_A1.setEmpName(n1);
	        Employee_A1.setEmpDateHired(date1);
	        Employee_A1.setEmpBirthDate(date2);
	        Employee_A1.setTotalSales(20000);
	        System.out.println(Employee_A1);
	        Employee_A1.displayInfo();
	        System.out.println(Employee_B1);
	        Employee_B1.displayInfo();
	        Employee_C1.setTotalSales(500000);
	        System.out.println(Employee_C1);
	        Employee_C1.displayInfo();
	        Employee_A2.setTotalSales(1000);
	        Employee_A2.setBaseSalary(250000);
	        Employee_A2.setEmpID(12774712);
	        Employee_A2.setEmpName(n1);
	        Employee_A2.setEmpDateHired(date1);
	        Employee_A2.setEmpBirthDate(date2);
	        System.out.println(Employee_A2);
	        Employee_A2.displayInfo();
	        System.out.println(Employee_B2);
	        Employee_B2.displayInfo();
	        Employee_C2.setTotalSales(600000);
	        Employee_C2.setBaseSalary(250000);
	        System.out.println(Employee_C2);
	        Employee_C2.displayInfo();
	}

}
