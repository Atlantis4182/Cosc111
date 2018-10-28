package lec9;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("ENTER $: ");
		String value = in.nextLine();
		int idx = value.indexOf('.');
		
		switch(idx) {
		case -1:
		
		
		System.out.println("Dollars: " + value);
		System.out.println("Cents: 0");
		break;
		case 0 :
			System.out.println("Dollars: 0");
			System.out.println("Cents: " + value.substring(1));
			break;
		case 1 : 
			System.out.println("Dollars: " + value.substring(0, idx));
			System.out.println("Cents: " + value.substring(idx+1));
		}

	}
}
