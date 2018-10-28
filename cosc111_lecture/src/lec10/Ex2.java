package lec10;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n1 = (int)(Math.random()*10);
		int n2 = (int)(Math.random()*10);
		
		int correct = n1 + n2;
		System.out.printf("what is %d + %d? ", n1, n2);
		int ans = in.nextInt();
		
		int triesLeft = 2;
		for (int tries = 0;ans != correct && tries < 3; tries++) {
			System.out.println("Incorrect, try again");
			System.out.println("You have " + triesLeft + " tries left");
			triesLeft -= 1;
			ans = in.nextInt();
		
		}
		if (triesLeft == 0) {
			
		} else {
		System.out.print("Correct");
		}
		in.close();
		
		
		
	}
}
