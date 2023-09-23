package employee.version2;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(10,5,2002);
        MyDate date2 = new MyDate(7,8,2003);
        HourlyEmployee E1 = new HourlyEmployee();
        HourlyEmployee E2 = new HourlyEmployee(7306389, "Mark Angelo Navarro", date1, date2, 50, 1000);
        HourlyEmployee E3 = new HourlyEmployee(7306396, "Ken Benedict Navarro", date1, date2);
        E1.setEmpID(21312411);
        E1.setEmpName("Ferdie Navarro");
        E1.setEmpDateHired(date1);
        E1.setEmpBirthDate(date2);
        E1.setTotalHoursWorked(40);
        E1.setRatePerHour(1000);
        System.out.println(E1);
        E1.displayInfo();
        System.out.println(E2);
        E2.displayInfo();
        E3.setTotalHoursWorked(30);
        E3.setRatePerHour(1000);
        System.out.println(E3);
        E3.displayInfo();
        PieceWorkerEmployee Employee_A = new PieceWorkerEmployee();
        PieceWorkerEmployee Employee_B = new PieceWorkerEmployee(7306389, "Mark Angelo Navarro", date1, date2, 50, 1000);
        PieceWorkerEmployee Employee_C = new PieceWorkerEmployee(7306396, "Ken Benedict Navarro", date1, date2);
        Employee_A.setEmpID(21312411);
        Employee_A.setEmpName("Ferdie Navarro");
        Employee_A.setEmpDateHired(date1);
        Employee_A.setEmpBirthDate(date2);
        Employee_A.setTotalPiecesFinished(500);
        Employee_A.setRatePerPiece(10000);
        System.out.println(Employee_A);
        Employee_A.displayInfo();
        System.out.println(Employee_B);
        Employee_B.displayInfo();
        Employee_C.setTotalPiecesFinished(400);
        Employee_C.setRatePerPiece(2000);
        System.out.println(Employee_C);
        Employee_C.displayInfo();
        CommissionEmployee Employee_A1 = new CommissionEmployee();
        CommissionEmployee Employee_B1 = new CommissionEmployee(7306389, "Mark Angelo Navarro", date1, date2, 50000);
        CommissionEmployee Employee_C1 = new CommissionEmployee(7306396, "Ken Benedict Navarro", date1, date2);
        Employee_A1.setEmpID(21312411);
        Employee_A1.setEmpName("Ferdie Navarro");
        Employee_A1.setEmpDateHired(date1);
        Employee_A1.setEmpBirthDate(date2);
        Employee_A1.setTotalSales(86000);
        System.out.println(Employee_A1);
        Employee_A1.displayInfo();
        System.out.println(Employee_B1);
        Employee_B1.displayInfo();
        Employee_C1.setTotalSales(1000000);
        System.out.println(Employee_C1);
        Employee_C1.displayInfo();
        BasePlusCommissionEmployee Employee_A2 = new BasePlusCommissionEmployee();
        BasePlusCommissionEmployee Employee_B2 = new BasePlusCommissionEmployee(7306389, "Mark Angelo Navarro", date1, date2, 50000, 25000);
        BasePlusCommissionEmployee Employee_C2 = new BasePlusCommissionEmployee(7306396, "Ken Benedict Navarro", date1, date2);
        Employee_A2.setEmpID(21312411);
        Employee_A2.setEmpName("Ferdie Navarro");
        Employee_A2.setEmpDateHired(date1);
        Employee_A2.setEmpBirthDate(date2);
        Employee_A2.setTotalSales(2000);
        Employee_A2.setBaseSalary(555000);
        System.out.println(Employee_A2);
        Employee_A2.displayInfo();
        System.out.println(Employee_B2);
        Employee_B2.displayInfo();
        Employee_C2.setTotalSales(900000);
        Employee_C2.setBaseSalary(970000);
        System.out.println(Employee_C2);
        Employee_C2.displayInfo();


    }
}
