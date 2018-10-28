package lec7;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = (int)(Math.random()*10);
		int y = (int)(Math.random()*10);
		
		if (x<y) {
			int temp = x;
			x = y;
			y = temp;
		}
		
		System.out.printf("What is %d - %d?\n",x,y);
		int ans = in.nextInt();
		if (ans == (x-y))
			System.out.println("Correct");
		else
			System.out.println("Wrong. the answer is" + ans);
		
		in.close();
	}	
}
