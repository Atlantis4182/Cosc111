package assignment2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the driving distance in miles:");
		double miles = in.nextDouble();
		
		System.out.println("Enter miles per gallon:");
		double milesGallon = in.nextDouble();
		
		System.out.println("Enter price in $ per gallon:");
		double price = in.nextDouble();
		
		double cost = miles / milesGallon * price;
		System.out.println("The cost of driving is $" + cost);
		
	}

}
