package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank acc1 = new bank();
		acc1.setAccountNumber(7306389);
		acc1.setBalance(5000);
		acc1.setName("Mark Navarro");
		acc1.setNumber("09399365107");
		acc1.setEmail("7306389@usc.edu.ph");
		
		System.out.println(acc1);
		
		acc1.deposit(8000);
		acc1.withdraw(8000);
		acc1.withdraw(200);
		acc1.withdraw(3000);
		acc1.withdraw(200);
		acc1.deposit(10000);
		acc1.withdraw(10000);
	}

}
