package ex4;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Rectangle 1, Enter the coordinates (x,y): ");
		int x1 = in.nextInt();// 1
		int y1 = in.nextInt();// 5
		
		System.out.print("Rectange 2, Enter the coordinates (x,y): ");
		int x2= in.nextInt(); // 4
		int y2 = in.nextInt();// 3
				
		System.out.print("Rectangle 1, width and height (width, height): ");
		int w1 = in.nextInt(); // 3
		int h1 = in.nextInt(); // 2
		
		System.out.print("Rectangle 2, width and height (width, height): ");
		int w2 = in.nextInt(); // 3
		int h2 = in.nextInt(); // 2
		
		// The question was a bit confusing for me, but I wrote it so that having the edges on the same line is not considered overlap.
		// Hopefully I won't be penalized if it's the opposite, it's an easy fix (get rid of the equals from <= and >=)
		
		if (((y1-h1 >= y2) || (y2-h2 >= y1) && (x1+w1 <= x2) || (x2+w2 <= x1))) {
			System.out.print("The rectangles do not overlap");
		} else
			System.out.print("The rectangles do overlap");
	
		in.close();
	}
}
