package ex7;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double avg;
		int i = 0;
		double sum = 0;
		int[] array = new int[100];
		
//		for (i = 0; array[i] > 0 || array.length > i ; i++) {
//			System.out.print("Enter a new score(-1 to end): ");
//			array[i] = in.nextInt();
//			if (array[i] != -1) 
//				sum += array[i];
//		}
		int counter= 0;
		System.out.print("Enter a new score(-1 to end): ");
		int ans = in.nextInt();
		while(ans >=0) {
			array[i] = ans;          // array[0] = ans(1), array[1]
			counter++;
			sum+=ans;
			System.out.print("Enter a new score(-1 to end): ");
			ans = in.nextInt();
			i++;
		}
		
		avg = sum/counter;
		
		System.out.printf("Average: %.2f\n", avg);
		System.out.printf("Total number of scores: %d\n", counter);
		
		int counterAbove = 0;
		int counterBelow = 0;
		for (i = 0; i < counter; i++) {
			if (array[i] >= avg) 
				counterAbove++;
			else if (array[i] < avg) 
				counterBelow++;
		}
		
		System.out.printf("Number of score above or equal to the average: %d\n",counterAbove);
		System.out.printf("Number of score below the average: %d\n", counterBelow);
		
		in.close();
	}
}
