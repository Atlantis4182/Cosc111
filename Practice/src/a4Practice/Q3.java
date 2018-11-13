package a4Practice;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three edges (length in double): ");
		double edge1 = in.nextDouble();
		double edge2 = in.nextDouble();
		double edge3 = in.nextDouble();
		
		if(isValid(edge1,edge2,edge3)) {
			double perimeter = edge1 + edge2 + edge3;
			System.out.printf("The perimeter is %.1f",perimeter);
		} else
			System.out.println("Input is invalid");
		
		in.close();
	}
	
	public static boolean isValid(double e1,double e2, double e3) {
		boolean status = false;
		
		double sum12 = e1 + e2;
		double sum23 = e2 + e3;
		double sum13 = e1 + e3;
		if(sum12 > e3) {
			if(sum23 > e1) {
				if(sum13 > e2) {	
					status = true;
				}
			}
		}
		return status;
	}
}
