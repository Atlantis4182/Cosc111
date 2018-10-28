package lec10;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = 100;
		char ans;
		do {
			System.out.println("Playing the game!!!");
			System.out.println("Do you want to play again/ (Y/N)");
			ans = in.next().charAt(0);
		} while(ans == 'Y'); // will run atleast one, even if condition is false
		
		System.out.println("Thank you");
	}
}
