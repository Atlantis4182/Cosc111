package ex2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		
		System.out.println("What's your name?");
		String name = in.nextLine();
		
		System.out.println("What is your birth year?");
		short birthYear = in.nextShort();
		
		int age = 2018 - birthYear;
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old.");
		
		in.close();
	}

}
