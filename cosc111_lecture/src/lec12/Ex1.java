package lec12;

public class Ex1 {
	public static void main(String[] args) {
		int x = 5;
		System.out.println("Before: "+x);
		x = incr(x);						 // you increment in incr method. "pass by value"
		System.out.println("After: "+x); // you dont increment in the main method
	}
	
	public static int incr(int a) {
		a++;
		System.out.println("Inside method: " + a);
		return a;
	}
}
