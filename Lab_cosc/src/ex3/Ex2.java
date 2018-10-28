package ex3;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = in.nextDouble(); // 11
		double y1 = in.nextDouble(); //33
		
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);

		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = in.nextDouble(); // 1
		double y2 = in.nextDouble(); // -5

		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		
		double earthRad = 6371.01 ;
		double d = earthRad * Math.acos((Math.sin(x1)*Math.sin(x2))+
				Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		
		System.out.println("The distance between the two points is "
		+ Math.round(d*100.00)/100.00 + "km");
		
		
	}
}
