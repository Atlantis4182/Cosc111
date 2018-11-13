package a7Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		String s1 = "Enter number of students: ";
		 String s2 = "Enter student grades: ";
		 double[] numbers = getNumsFromUser(s1, s2);
		 System.out.println(Arrays.toString(numbers));
	}
	
	public static double[] getNumsFromUser (String msg1, String msg2) {
		
		Scanner in = new Scanner(System.in);
		System.out.print(msg1);
		int amount = in.nextInt();
		System.out.print(msg2);
		double[] grades = new double[amount];
		
		for (int i = 0; i < amount; i++) {
			grades[i] = in.nextDouble();
		}
		in.close();
		
		return grades;
	}
}
