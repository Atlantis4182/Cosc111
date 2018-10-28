package ex5;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students (1 to 30): ");
		int stud = in.nextInt();

		while (stud < 1 || stud > 30) {
			System.out.print("Invalid number. Try again: ");
			stud = in.nextInt();
		}

		double greatest = 0;
		int x = 1;
		double gpa;
		while (x <= stud) {

			System.out.printf("Enter the GPA of Student %d: ", x);
			gpa = in.nextDouble();
			x++;
			if (gpa > greatest && gpa <= 4.0 && gpa >= 0.0) {
				greatest = gpa;
			}
			while (gpa < 0.0 || gpa > 4.0) {
				System.out.print("Invalid GPA value. Try again: ");
				gpa = in.nextDouble();
				if (gpa > greatest && gpa <= 4.0 && gpa >= 0.0) {
						greatest = gpa;
				}
			}
		}

		System.out.print("Top GPA is " + greatest);

		in.close();

	}
}
