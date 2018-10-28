package lec9;

import java.util.Scanner;

public class MT1review {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a;
		int b;
		System.out.print("Enter two numbers: ");
		a = in.nextInt();
		b = in.nextInt();
		
		if (a != b) {
			System.out.print(a + b);
		} else {
			System.out.print(Math.pow(a,b));
		}
		
		
	}
}
