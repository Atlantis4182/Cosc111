package lec5;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		//read a character from user
		Scanner in = new Scanner(System.in);
		System.out.println("Do you want to play again? (Y/N)");
		
		
//		String a = in.nextLine(); // "yes", "y", "Yes I do"
//		char answer = a.charAt(0);

		char answer = in.nextLine().charAt(0);
		
		
		
		System.out.println("you said " + answer);
		
		
		
		
		
	}

}
