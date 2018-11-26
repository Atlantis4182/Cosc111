package ex9;

import java.util.Scanner;

public class QETest {
	public static void main(String[] args) {
		
		QuadraticEquation qe = new QuadraticEquation(0,0,0);
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		qe.getterA(a);
		qe.getterB(b);
		qe.getterC(c);
		
		if (qe.getDiscriminant(a,b,c) < 0)
			System.out.println("The equation has no real roots");
		else if (qe.getDiscriminant(a,b,c) == 0)
			System.out.printf("The root is %.1f",qe.getRealRoot2());
		else
			System.out.printf("The equation %.1f and %.1f",qe.getRealRoot1(),qe.getRealRoot2());
	
	}
}
