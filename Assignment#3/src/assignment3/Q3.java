package assignment3;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000: ");
		int x = in.nextInt(); //956
	
		int a = x/1000; // 0
		int aq = x%1000; // 956
		int b = aq/100; // 9
		int bq = x%100; // 56
		int c = bq/10; // 5
		int cq = x%10; //6
		int d = cq/1; //6

		int z = a + b + c + d;
		System.out.printf("The sum of all digits in %d is %d", x, z);
		
		in.close();
	}
}
