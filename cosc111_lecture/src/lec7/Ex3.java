package lec7;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("How long have you been driving?");
		int dur = in.nextInt();
		in.nextLine();
		System.out.println("Have you had training?");
		String training = in.nextLine();
		
		if (dur>2 || training.equals("Yes"))
			System.out.println("you can get your lic.");
		else
			System.out.println("You cannot get your driving lic");
		
//		if (rainy || sunny)
//			System.out.println("take Umbrella");
//		else
//			System.out.println();
		
		in.close();
		
		
		
		
	}
}
