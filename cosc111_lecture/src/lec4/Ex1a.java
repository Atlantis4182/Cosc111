package lec4;

import java.util.Scanner;

public class Ex1a {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter $ amount as xxx.xx");
		double amount = in.nextDouble();
		
		// 2) convert to cents // casting = (int) so 11.56 * 100 = 1156.0 turns into 1156
		int cents = (int)(amount * 100);
		
		//3a) get dollar amount by dividing by 100. so from 1156 we get 11
		//3b get the remaining cents - 1156%100 = 56
		int dollars = (int)(cents/100);
		int remaining = cents%100;
		
		int quarters = remaining / 25; //2
		remaining = remaining % 25;  //6
		
		int dimes = remaining / 10;
		remaining = remaining % 10;
		
		int nickles = remaining / 5;
		remaining = remaining % 5;
		
		
		
		System.out.println(dollars); // 11
		System.out.println(quarters);
		System.out.println(dimes);
		System.out.println(nickles);
		System.out.println(remaining); //56
		
		
		
		
		
	}

}
