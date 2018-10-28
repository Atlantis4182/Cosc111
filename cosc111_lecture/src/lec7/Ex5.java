package lec7;

public class Ex5 {
	public static void main(String[] args) {
		
		int n = 7;
		if(n==3)
			System.out.println("THREE");
		else if (n==7)
			System.out.println("SEVEN");
		else if (n==1)
			System.out.println("ONE");
		else 
			System.out.println("Another Number");
		
		switch(n) {
		case 3: System.out.println("THREE");	break;
		case 1: System.out.println("ONE");	break;
		case 7: System.out.println("SEVEN");	break;
		default: System.out.println("Unknown");	break;
		}

	}
	
	
}
