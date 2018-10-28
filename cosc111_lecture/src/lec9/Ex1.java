package lec9;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		
		//find the sum of 5 values obtained form user
		
		/*Algorithm
		 * LOOP:
		 * 1) Initialize the counter ( usually 0)
		 * must havce count++
		 * 
		 * 1) repeat the following (user number amount) times:
		 * -get a value from user
		 * add it to sum
		 * 2) display the sum
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value (0 to stop): ");
		double value = in.nextDouble();
		int  count = 0;
		if (value != 0) {
			count++;
		}
		double sum = 0;
		
		//Sentinel-controlled repetition
		while(value != 0) {
			sum += value;
			System.out.print("Enter a value: ");
			value = in.nextDouble();
			if (value != 0) {
				count++;
			}
		}
		
		System.out.println("The sum is " + sum);
		System.out.println("The ave. is " + sum/(count));
		
		
		in.close();
	}
}
