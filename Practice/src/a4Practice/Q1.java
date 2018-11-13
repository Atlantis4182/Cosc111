package a4Practice;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char user = in.next().toLowerCase().charAt(0);
		in.close();
		
		if(Character.isLetter(user)) {
			if(user == 'a' || user == 'e' || user == 'u' || user == 'i' || user == 'o') {
				System.out.printf("%c is a vowel",user);
			} else
			System.out.printf("%c is a consonant", user);
		} else
			System.out.printf("%c is an invalid input",user);
		
	}
}
