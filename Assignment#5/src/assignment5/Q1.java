package assignment5;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first integer (0 to terminate): ");
		int counter = 0;
		int countPos = 0;
		int countNeg = 0;
		int countEven = 0;
		int countOdd = 0;
		double total = 0;
		double average = 0;
		
		int user = in.nextInt();
		
		
		if (user%2 == 0 && user !=0) 
			countEven++;
		if (user%2 == 1 || user == 1) 
			countOdd++;
		if (user > 0) 
			countPos++;
		if (user < 0) 
			countNeg++;	
		if (user != 0)
			counter++;
		
		total = total + user;
		
		if (user == 0) {
			System.out.println("No numbers are entered except 0");
		} else {
			while (user>0 || user<0) {
			System.out.print("Enter the next integer (0 to terminate): ");
			user = in.nextInt(); // 3, 1 ,6 ,0
				if (user%2 == 0 && user !=0) 
					countEven++;
				if (user%2 == 1 || user == 1) 
					countOdd++;
				if (user > 0) 
					countPos++;
				if (user < 0) 
					countNeg++;	
				if (user != 0)
					counter++;
				total = total + user;

			}
			average = total/counter;

			System.out.println("The number of positives is " + countPos);
			System.out.println("The number of negatives is " + countNeg);
			System.out.println("The number of evens is " + countEven);
			System.out.println("The number of odds is " + countOdd);
			System.out.println("The total is " + total);
			System.out.printf("The average is %.2f" , average);
			
		}
		
		in.close();
	}
	}

