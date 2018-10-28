package ex5;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = in.nextInt(); //5
		int y = 1;
		int i = 1;
		System.out.println();
		
		System.out.println("Pattern I");
		System.out.println("---------");
		
		while (y <= x) {
		System.out.print(y + " ");
			if (y == i && i<x) {
				y =  1;
				i += 1;
				System.out.println();
			} else
			y++; //note for me: at the end of loop, y = x+1
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Pattern II");
		System.out.println("---------");
		
		int z = 1;
		while (z <= x) {
		
		System.out.print(z + " ");
		if (z == x) {
			z  = 0;
			x -= 1;
			System.out.println();
		}
		z++;	
		}
		
		in.close();
	}
}
