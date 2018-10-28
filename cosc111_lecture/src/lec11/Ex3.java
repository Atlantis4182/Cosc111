package lec11;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println( autoInsurance(0) );
	
		System.out.println( autoInsurance(2) );
		
		if (autoInsurance(1) > 500)
			System.out.println("too much!");
		else 
			System.out.println("Noice!");
	}
	
	
	public static double autoInsurance(int numAccidents) {
		double amount = 800;
		switch(numAccidents) {
		case 0: break;
		case 1 :amount *= 1.1; break;
		case 2: amount *= 1.25; break;
		default: amount = 1000000;
		

	}
		return amount;
		
	}
	
}
