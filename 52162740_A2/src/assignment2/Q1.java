package assignment2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter v0, v1, and t:");
		Double v0 = in.nextDouble();
		Double v1 = in.nextDouble();
		Double t  = in.nextDouble();
		
		double a = (v1-v0)/t;
		System.out.println("The average acceleration is " + a);
		
	}

}
