package ex2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weightLb = in.nextDouble();
		
		System.out.print("Enter your height in inches: ");
		double heightIn = in.nextDouble();
		
		double weightKg = weightLb * (0.45359237);
		double heightM = heightIn* (0.0254);
		
		double BMI = weightKg/(Math.pow(heightM, 2));
		System.out.println("Your BMI is " + BMI);
		
		
		
	}

}
