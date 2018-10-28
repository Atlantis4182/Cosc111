package lec10;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("How old are you: ");
		int age = in.nextInt();
		while (age<0 || age > 150) {
			System.out.println("Invalid value");
			age = in.nextInt();
		}
			System.out.println("you are " + age);
		
		
		in.close();
	}

}
