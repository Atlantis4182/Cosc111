package a7Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		String s1 = "How many numbers in the list: ";
		 String s2 = "Enter the list: ";
		 double[] numbers = getNumsFromUser(s1, s2);
		 System.out.println(Arrays.toString(numbers));

		 if (isSorted(numbers)) 
			 System.out.println("The list is already sorted");
		 else
			 System.out.println("The list is not sorted");
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
	
	public static boolean isSorted(double[] list) {
	
	boolean status = false;
	int counter = 0;
	
	for (int i = 0; i < (list.length-1); i++) {
		if (list[i] < list[i+1])
			counter++;
			if(counter == list.length-1)
				status =true;
	}
	return status;
	}
}
