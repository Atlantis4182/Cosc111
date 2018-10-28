package ex4;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int random = (int)(Math.random()*2);
		
		
		System.out.print("Guess head or tail(H or T)? " );
		String user = in.nextLine();
		char ans = user.charAt(0);
		
		if ((random == 0 && ans == 'H')|| (random == 1 && ans == 'T')) {
			System.out.print("Correct guess");
		} else if (random == 0 && ans == 'T') {	
			System.out.print("Sorry, it's heads");
		} else
			System.out.print("Sorry, it's tails");
		
		
		
		in.close();
	}
}
