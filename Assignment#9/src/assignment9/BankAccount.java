package assignment9;

public class BankAccount {
	//attributes
	private int id;
	private double balance,annualInterestRate;
	private static int count;
	
	//constructors
	BankAccount(double balance, double aIR){
		this.balance = balance;
		annualInterestRate = aIR;
		count++;
		id = count;
	}
	BankAccount(){
		balance = 0;
		annualInterestRate = 0;
	}
	
	//methods
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public double getMonthlyInterest() {
		double monthlyInt = (double)balance*annualInterestRate/(12*100);
	return monthlyInt;
	}
	public double getMIR() {
		double monthlyRate = (double)annualInterestRate/12;
		return monthlyRate;
	}
	public void withdrawl(double remove) {
		balance -= remove;
	}
	public void deposit(double add) {
		balance += add;
	}
	public String displayInfo(int id, String bal, String Arate, String Mrate, String MI) {
		return "Account ID: "+id+ "\n"
				+ "Current Balance: $"+bal+"\n"
				+ "Annual interest rate: "+Arate+" %\n"
				+ "Monthly interest rate: "+Mrate+" %\n"
				+ "Monthly interest: $"+MI;
	}
	
	
}

