package lec8;

public class Ex1me {
	public static void main(String[] args) {
		
		int num = 4;
		System.out.println((num % 2 == 0) ? num + " is even": num + " is odd");
		
		// same thing is:
		
		if (num%2 == 0) {
			System.out.println(num + " is even");
		} else
			System.out.println(num + " is odd");
		
		
		int x =5, y =2;
		String t = x>y ? "larger": "smaller";
		System.out.println(t);
		
		
		int count=0;
		
		while (count<100) {
			
			System.out.println("Welcome to Java");
			
			count++;
		}
		
		int s = 2;
		if (s<=5 && s>=1) {
			System.out.println("weekday");
		} else if (s == 0 || s == 6) {
			System.out.println("weekend");
		} else {
			System.out.println("Unknown day");
		}
	}
}
