package employee.version6;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Name name1 = new Name("Mark", "Angelo", "Navarro");
	        Name name2 = new Name("Ken", "Benedict", "Navarro");
	        Name name3 = new Name("Sharon", "Marie", "Navarro");
	        Name name4 = new Name("Ferdinand", "Edgecock", "Navarro");
	        Name name5 = new Name("Roald", "R", "Batuhan");
	        MyDate date1 = new MyDate(30,4,2002);
	        MyDate dateA = new MyDate(29,5,2012);
	        MyDate dateB = new MyDate(28,6,2002);
	        MyDate dateC = new MyDate(27,7,1990);
	        MyDate dateD = new MyDate(26,8,1740);
	        MyDate dateE = new MyDate(25,3,1939);

        Employee emp1 = new HourlyEmployee(10, name1, dateA, date1, 40, 2000);
        Employee emp2 = new PieceWorkerEmployee(20, name2, dateB, date1, 100, 10000);
        Employee emp3 = new CommissionEmployee(30, name3, dateC, date1, 500000);
        Employee emp4 = new BasePlusCommissionEmployee(40, name4, dateD, date1, 150000, 30000);
        Employee emp5 = new PieceWorkerEmployee(50, name5, dateE, date1, 90, 10000);
        EmployeeRoster list = new EmployeeRoster(10);
        list.addEmployee(emp1);
        list.addEmployee(emp2);
        list.addEmployee(emp3);
        list.addEmployee(emp4);
        list.addEmployee(emp5);
        list.displayAllEmployees();
        list.displayHE();
        list.displayPWE();
        list.displayCE();
        list.displayBPCE();
        list.removeEmployee(30);
        System.out.println("\n");
        list.displayAllEmployees();
        System.out.println("\n");
        Employee catcher = list.getEmployee(50);
        System.out.println(catcher);
        System.out.println("\n");
        list.updateEmployee(50);

        System.out.println(catcher);

    }
}

