package lec7;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insert a number: ");
		int x = in.nextInt();
		
		if (x%2 == 0  && x%3 == 0) {
			System.out.println("and");
		} else if (x%2 == 0 || x%3 == 0) {
			System.out.println("or");
			
		} else if ((x%2 == 0 || x%3 == 0)^(x%2 == 0  && x%3 == 0)) {
				System.out.println("both");
		} else
			System.out.println("it's not divisable by 2 or/and 3");
		
		in.close();
	}
}
