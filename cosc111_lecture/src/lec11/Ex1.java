package lec11;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		for (int i=0;i<5;i++) { // how many rows of stars
				for(int c = 0; c<20; c++) //print how many columns in each row 
						System.out.print("*");
				System.out.println();	//move to next line
				
		}
		System.out.println("WELCOME TO OUR GAME");
		

		for (int i=0;i<5;i++) { // how many rows of stars
				for(int c = 0; c<20; c++) //print how many columns in each row 
						System.out.print("*");
				System.out.println();	//move to next line
		}
		
		System.out.println("this game is for....");
		System.out.println("this game is for....");
		
		for (int i=0;i<5;i++) { // how many rows of stars
			for(int c = 0; c<20; c++) //print how many columns in each row 
					System.out.print("*");
			System.out.println();	//move to next line
	}
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("Welcome " + name);
		
		for (int i=0;i<5;i++) { // how many rows of stars
			for(int c = 0; c<20; c++) //print how many columns in each row 
					System.out.print("=");
			System.out.println();	//move to next line
	}
		
	}
}
