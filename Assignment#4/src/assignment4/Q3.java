package assignment4;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three edges (length in double): ");
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		double num3 = in.nextDouble();
		
		double sum1 = num1 + num2; // needs to be bigger than num3
		double sum2 = num2 + num3; // needs to be bigger than num1
		double sum3 = num3 + num1; // needs to be bigger than num2
		
		while(num1<0 || num2<0 || num3<0 || (sum1<num3 && sum2<num1 && sum3<num2)) {
			System.out.println("input invalid");
			System.out.print("Enter three edges (length in double): ");
			num1 = in.nextDouble();
			num2 = in.nextDouble();
			num3 = in.nextDouble();
		}
		
		double sumTotal = num1 + num2 + num3;
		
		System.out.println("The perimeter is " + sumTotal);
				
		in.close();
	}
}
