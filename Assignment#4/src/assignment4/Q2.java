package assignment4;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		System.out.print("Enter a valid plate number: ");
		String plate = in.nextLine(); // Valid: AR-24
		
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String num = "0123456789";
		
		// 0 == does not pass if condition. 1 == passes if condition
		int abc1 = 0;
		int abc2 = 0;
		int dash = 0;
		int num1 = 0;
		int num2 = 0;
		
		int q = 0;
		int w = 0;
		int e = 0;
		int r = 0;

		for (; q < abc.length(); q++) {
			if (abc.charAt(q) == plate.charAt(0)) { 
				abc1 = 1;
			}
		}
		for (; w < abc.length(); w++) {
			if (abc.charAt(w) == plate.charAt(1)) { 
				abc2 = 1;
			}
		}
			if (plate.charAt(2) == '-') { 
				dash = 1;
			}
		
		for (; e < num.length(); e++) {
			if (num.charAt(e) == plate.charAt(3)) { 
				num1 = 1;
			}
		}
		for (; r < num.length(); r++) {
			if (num.charAt(r) == plate.charAt(4)) { 
				num2 = 1;
			}
		}
		
		if (abc1 == 1 && abc2 == 1 && dash == 1 && num1 == 1 && num2 == 1 && plate.length() == 5) {
			System.out.println( plate + " is a valid plate number");
		} else {
			System.out.println( plate + " is not a valid plate number");
	}
		
		in.close();
	}
}
