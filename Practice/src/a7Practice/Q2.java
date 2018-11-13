package a7Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
		public static void main(String[] args) {
			String s1 = "Enter number of students: ";
			 String s2 = "Enter student grades: ";
			 double[] numbers = getNumsFromUser(s1, s2);
			 System.out.println(Arrays.toString(numbers));
			 showLetterGrades(numbers);
		}
		
		public static double[] getNumsFromUser (String msg1, String msg2) {
			
			Scanner in = new Scanner(System.in);
			System.out.print(msg1);
			int amount = in.nextInt();
			System.out.print(msg2);
			double[] grades = new double[amount];
			
			for (int i = 0; i < amount; i++) {
				grades[i] = in.nextDouble();
			}
			in.close();
			
			return grades;
		}
		
		
		public static void showLetterGrades(double[] grades) {
			
			double markHigh = 0;
			int realStudentNum = 0;	
			int gradesDec = 0;
			
			for (int i = 0; i < grades.length; i++) {		//67,93,55,78
				if (grades[i]>markHigh) 
					markHigh = grades[i];
			}
			for (int j = 0; j < grades.length; j++) {		//markHigh == 93
				for (int k = 1; k < 100000000; k++) {
					gradesDec = (int)(markHigh - 10*(k));
				if (grades[j] >= gradesDec) {
					realStudentNum = j+1;
					char letter = (char)('@'+ k);    // k - 1, @ is before A
					if (k > 4)
						letter = 'F';
					System.out.printf("Student %d score is %.1f and grade is %c\n",realStudentNum,grades[j],letter);
					break;
					}
				}
			}
			
			
			
			
	}
}
