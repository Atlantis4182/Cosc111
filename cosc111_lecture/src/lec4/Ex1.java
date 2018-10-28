package lec4;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your monetary value:" );
		double money = in.nextDouble();
		
		//convert $ -> cents
		
		double cents = money * 100;
		
		double dollars = cents/100;
		double dollarsR = cents%100;
		
		
		double quarters = dollarsR/25;
		double quartersR = dollars%25;
		
		
		double dimes = quartersR /10;
		double dimesR   = quarters%10;
		
		
		double nickle = dimesR/5;
		double nickleR  = dimes%5;
		
		
		double pennies	= nickleR/1;	
		double penniesR = nickle%1;
		
		
		
	}

}
