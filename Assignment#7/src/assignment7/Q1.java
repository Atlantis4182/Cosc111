package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		 String s1 = "Enter number of students: ";
		 String s2 = "Enter student grades: ";
		 double[] numbers = getNumsFromUser(s1, s2);
		 System.out.println(Arrays.toString(numbers));
		}
		public static double[] getNumsFromUser(String msg1, String msg2){
			Scanner in = new Scanner(System.in);
			
			double[] array;
			int total;
			double num;
			
			System.out.print(msg1);
			total = in.nextInt();
			array = new double[total];
						
			System.out.print(msg2);
			for (int i = 0; i < array.length; i++) {
				num = in.nextDouble();
				array[i]= num;
			}
			
			in.close();
			return array;
			
		}

}
