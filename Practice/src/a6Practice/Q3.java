package a6Practice;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int user = in.nextInt();
		in.close();
		
		System.out.println(reverse(user));
		if (isPalindrome(user)) {
			System.out.printf("%d is a palindrome",user);
		} else 
			System.out.printf("%d is not a palindrome",user);
	}
	
	public static int reverse(int number) {

		String numStringF = String.valueOf(number);  //changing int to String		
		int numStringF2 = numStringF.length() - 1;
		int reverse = 0;
		int reverse2 = 0;
		
		for (int i = numStringF2; i >= 0; i--) {
			reverse = numStringF.charAt(i) - 48;
			reverse2 += reverse*(int)(Math.pow(10, i));
		}
		
		return reverse2;
	}
	public static boolean isPalindrome(int number) {
		boolean status = false;
		
		if (reverse(number) == number) 
			status = true;
		
		return status;
	}
}
