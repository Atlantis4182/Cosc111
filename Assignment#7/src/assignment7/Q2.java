package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		 String s1 = "Enter number of students: ";
		 String s2 = "Enter student grades: ";
		 double[] numbers = getNumsFromUser(s1, s2);
		 System.out.println(Arrays.toString(numbers));
		 showLetterGrades(numbers);

//		 for(int i = 0; i < numbers.length; i++) {
//			 int index = i+ 1;
//			 System.out.printf("Student %d score is %.1f and grade is \n",index,numbers[i]);
//		 }
		 
	}
		public static double[] getNumsFromUser(String msg1, String msg2){
			Scanner in = new Scanner(System.in);
			
			double[] array;
			int total;
			double num;
			
			System.out.print(msg1);
			total = in.nextInt();                    // 4
			array = new double[total];
						
			System.out.print(msg2);
			for (int i = 0; i < array.length; i++) { // 67 93 55 78
				num = in.nextDouble();
				array[i]= num;
			}
			
			in.close();
			return array;
			
		}
		
		public static void showLetterGrades (double[] grades) {
			
			char[] mark = new char[grades.length]; 

			for(int i =0; i < mark.length; i++) {

				mark[i] = 'A';
				mark[i] += i;
				
				if (mark[i] == 'E') {
					mark[i] = 'F';
				}
			}
			
			double highestMark = 0;
			for(int i = 0; i < grades.length;i++) {
				
				if ( grades[i] > highestMark)
					highestMark = grades[i];
			}
			
			int index = 0;
			
			for (int i = 0; i < grades.length; i++) {
				index += 1;
				if (grades[i] >= (highestMark-10)) {
					 System.out.printf("Student %d score is %.1f and grade is %c\n",index,grades[i],mark[0]);
				} else if (grades[i] >= (highestMark-20)) {
					 System.out.printf("Student %d score is %.1f and grade is %c\n",index,grades[i],mark[1]);

				} else if (grades[i] >= (highestMark-30)) {
					 System.out.printf("Student %d score is %.1f and grade is %c\n",index,grades[i],mark[2]);

				} else if (grades[i] >= (highestMark-40)) {
					 System.out.printf("Student %d score is %.1f and grade is %c\n",index,grades[i],mark[3]);

				} else
					 System.out.printf("Student %d score is %.1f and grade is %c\n",index,grades[i],mark[4]);
			}		
		}
	}

