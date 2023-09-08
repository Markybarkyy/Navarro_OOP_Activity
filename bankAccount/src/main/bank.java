package main;

public class bank {
	private int accountNumber;
	private float balance;
	private String name;
	private String email;
	private String number;
	private float amount;
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public void deposit(float amount) {
	this.balance += amount;
	System.out.println("Amount Deposited: " + amount + "\nRemaining Balance: " + this.balance + "\n");
		
}
public void withdraw(float amount) {
	if(this.balance >= amount) {
		this.balance -= amount;
		System.out.println("Amount withdrawn: " + amount +
				"\nRemaining Balance: " + this.balance + "\n");
	}else {
		System.out.println("Insufficient Funds");
	}
}
@Override
public String toString() {
	return String.format("\nAccount Number: " + this.accountNumber
			+ "\nName: "+ this.name
			+ "\nEmail: "+ this.email
			+ "\nPhone Number: " + this.number
			+ "\nBalance: "+ this.balance);
	}
}

