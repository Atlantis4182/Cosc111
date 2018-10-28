package assignment4;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char letter = in.next().toLowerCase().charAt(0);

		String vowels = "aeuio";
		String consonants = "bcdfghjklmnpqrstvwxyz";

		int i = 0;
		int d = 0;
		
		int ctrl = 1;
		int ctrl2 = 2;
		
		for (; i < vowels.length(); i++) {
			if (vowels.charAt(i) == letter) { 
				System.out.printf("%c is a vowel", letter);
				ctrl = 10;
			}
		}
		
		for (; d < consonants.length(); d++) {
		 if (consonants.charAt(d) == letter)	{	
				System.out.printf("%c is a consonant", letter);
		 		ctrl2 = 20;
		 }
		} 
		if ( ctrl == 1 && ctrl2 == 2) 
			System.out.printf("%c is an invalid input", letter);
		
		in.close();
		}
}
