package lec3;

import java.util.Scanner; //ctrl+shift+o

public class Ex5 {

	public static void main(String[] args) {

			//read radius then display area of circle
		
		// 1) read radius
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = in.nextDouble();
		
		// 2) compute area             // Math a sub-section in java, gives us stuff 
		double area = Math.PI * Math.pow(radius, 2);
		
		// 3) display area
		System.out.println("Area: " + area );
		
	}

}
