package assignment3;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a real number: ");
		double x = in.nextDouble();
		
		int integer = (int)x;
		System.out.printf("Integer part: %d\n" , integer  );
		
		double fraction = x%integer;
		System.out.print("Fraction part: " + fraction);
		
		in.close();
		
	}
}
