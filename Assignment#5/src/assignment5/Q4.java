package assignment5;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int amount = in.nextInt();
		in.nextLine();
		
		String topName = "";
		String secName = "";
		String tempName = "";
		double top = 0;
		double sec = 0;
		double temp = 0;
		
		
		for (; amount>0 ; amount-- ) {
			System.out.print("Enter a student name: ");
			String name = in.nextLine();
			System.out.print("Enter a student score: ");
			double score = in.nextDouble();
			in.nextLine();
			
			if (temp<score) {
				secName = tempName;
				sec = temp;
			}
			if (score>top) {
				topName = name;
				top = score;
				temp = top;
				tempName = name;
			} else if (score>sec) {
				secName = name;
				sec = score;	
			}
		}

		
		System.out.println("Top two students: ");
		System.out.printf("%s's score is %.1f\n",topName,top);
		System.out.printf("%s's score is %.1f",secName,sec);
		
		in.close();
	}
}
