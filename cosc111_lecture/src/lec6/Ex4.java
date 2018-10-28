package lec6;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// get an int N from user
		// if N is multiple of 5, print...
		// if N is a multiple of 2, print..
		
		
		System.out.print("Enter an integer: ");
		int x = in.nextInt();
		
		if (x%5 == 0) {
			System.out.println("HiFive");
		} 
		
		if (x%2 == 0) {
			System.out.println("HiEven");
			System.out.println("Divisible by 2");
		} else {
			System.out.println("NotHiEven");
			System.out.println("Not divisible by 2");
		} 
		
		System.out.println("Thanks yo");
		
		in.close();
	}
}
