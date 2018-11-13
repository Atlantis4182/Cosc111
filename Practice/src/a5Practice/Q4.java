package a5Practice;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int number = in.nextInt();
		
		double highScore = 0;
		double secondScore =0;
		String highName = "";
		String secondName = "";
		
		in.nextLine();
		
		for(int i = 0; i < number;i++) {
			System.out.print("Enter a student name: ");
			String name = in.nextLine();
			System.out.print("Enter a students score: ");
			double score = in.nextDouble();
			in.nextLine();
			if (score> highScore) {
				secondScore = highScore;
				secondName = highName;
				highScore = score;
				highName = name;
			} else if (score > secondScore) {
				secondScore = score;
				secondName = name;
			}
		}
		System.out.println("Top two students:");
		System.out.printf("%s's score is %.1f\n",highName,highScore);
		System.out.printf("%s's score is %.1f",secondName,secondScore);
		
		in.close();
	}
	
	
}
