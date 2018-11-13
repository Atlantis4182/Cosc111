package a5Practice;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int counter = 1;
		int counterEven = 0;
		int counterOdd = 0;
		int counterPos = 0;
		int counterNeg = 0;
		System.out.print("Enter the first integer (0 to terminate): ");
		int user = in.nextInt();
		sum += user;
		if (user%2 == 0)
			counterEven++;
		else 
			counterOdd++;
		if (user > 0)
			counterPos++;
		else
			counterNeg++;
		if(user == 0) {
			System.out.println("No numbers are entered except 0");
		} else {
		while(user != 0) {
			System.out.print("Enter the next integer (0 to terminate): ");
			user = in.nextInt();
			if (user != 0) {
				counter++;
			sum += user;	
			if (user%2 == 0)
				counterEven++;
			else 
				counterOdd++;
			if (user > 0)
				counterPos++;
			else
				counterNeg++;
			}
		}
		in.close();
		
		double avg = sum/counter;
		
		System.out.printf("The number of positives is %d\n",counterPos);
		System.out.printf("The number of negatives is %d\n",counterNeg);
		System.out.printf("The number of even is %d\n",counterEven);
		System.out.printf("The number of odds is %d\n",counterOdd);
		System.out.printf("The total is %d\n",sum);
		System.out.printf("The average is %.2f\n",avg);
		}
	
	}
	

}
