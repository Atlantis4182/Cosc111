package assignment3;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit "
				+ "between -58 F and 41 F: ");
		double eTemp = in.nextDouble(); //33
		
		System.out.print("Enter the wind speed miles per hour (must be greater "
				+ "than or equal to 2) : ");
		double wind = in.nextDouble(); //5
		
		double temp = 35.74 + 0.6215*(eTemp) - 35.75*Math.pow(wind, 0.16) +
				0.4275*(eTemp)*Math.pow(wind, 0.16);
		System.out.printf("the wind chill index is "+ temp);
		
		in.close();
		
	}
}
