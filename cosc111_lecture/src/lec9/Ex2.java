package lec9;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int num = (int)(Math.random()*101); //0 - 100 --> you need to * b5y 101
		System.out.print("Try to guess the number between 0 - 100: ");
		int guess = in.nextInt();
		
		while(num != guess) {
			if ( guess < num) {
				System.out.print("Too low! Try again: ");
				guess = in.nextInt();
				System.out.println();
		} else {
			System.out.print(" Too high! Try again: ");
			guess = in.nextInt();
			System.out.println();
	}}
		
		System.out.print("Yes, my number is " + num);
		in.close();
 	}
}
