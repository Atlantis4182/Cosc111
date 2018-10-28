package ex4;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		if (x>y) {
			int temp = x;
			x = y;
			y = temp;
		}
		
		if (y>z) {
			int temp = y;
			y = z;
			z = temp;
		}
		
		if (x>y) {
			int temp= x;
			x = y;
			y = temp;
		}
		
		System.out.printf("The sorted numbers: %d %d %d",x,y,z);

		in.close();
	}
}
