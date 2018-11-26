package assignment9;

public class BankTest {
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount(33000,6.7);
		
		ba.withdrawl(1500);
		ba.deposit(1000);
		

		String bal = String.format("%.1f",ba.getBalance() );    //String.format is used for decimal places. Seems weird, but its the only thing that works
		String aIR = String.format("%.3f",ba.getAnnualInterestRate());
		String mIR = String.format("%.3f",ba.getMIR());
		String mInt = String.format("%.3f",ba.getMonthlyInterest());
		System.out.println(ba.displayInfo(ba.getId(),bal,aIR,mIR,mInt));
			
}
}
