package assignment3;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double x = in.nextDouble();
		
		
		double ao1 = (x*2) +(Math.pow(x,2)) - x/4 + x%3; // Java uses BEDMAS first and does any arithmetic
		double ao2 = 9*(x-3+5)+ Math.sqrt(x);
		System.out.println(ao1);
		System.out.println(ao2);
		
		
		double aa1 = (x *= 2)+(x += 3); // First, x*2 then ((x*2) + 3) then adds the two together
		double aa2 = (x -= 3)+(x /= 2); // First, x-3 then (x-3)/2 then adds the two together
		System.out.println(aa1); // a new x is formed and used in the rest of the equation
		System.out.println(aa2);
		
		System.out.println("value of x: " + x);
		
		System.out.println(x++ + ++x); // Preincrement = x+1 then print. Post-increment = print then x+1.
		System.out.println(--x - x--); // Predecrement = x-1 then print. Postdecrement = print then x-1
		                               //If it sees a preincrement/predecrement statement, it does all the math in the statement first then prints
		
		
		in.close();
		
	}
}
