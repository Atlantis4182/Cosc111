package lec6;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		//Selection:
		
		Scanner in = new Scanner(System.in);
		
		// 1) get age from user
		//2 if age larger than or equal 17, then get driving license 
		// 3) otherwise tell them to comce back later
		

		
		System.out.println("How old are you?");
		int age = in.nextInt();
		
		if (age >= 17) {
			System.out.println("Congratz, you get a driv. lic");
			System.out.println("fill out this form...");
		} else {
			System.out.println("Sorry. you need to be 17 "
					+ "or older to get a driving lic.");
		}
			
			
			in.close();
			
	}
}
