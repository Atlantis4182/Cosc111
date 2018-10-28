package ex2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Amount of water in kilograms: ");
		double water = in.nextDouble();
		
		System.out.print("Initial and final temperature  in degrees Celsius: ");
		double initialTemp = in.nextDouble();
		double finalTemp = in.nextDouble();
		
		double Energy = water*(finalTemp - initialTemp)*4184;
		System.out.print("The energy needed is " + Energy + " joules");
		
	}

}
