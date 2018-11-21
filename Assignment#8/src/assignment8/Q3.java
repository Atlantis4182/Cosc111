package assignment8;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
	String[][] table = { 
	{"Alberta", "edmonton"},
	{"British Columbia","victoria"},
	{"Manitoba","winnipeg"},
	{"New Brunswick","fredicton"},
	{"Newfoundland and Labrador","st. john's"},
	{"Nova Scotia","halifax"},
	{"Ontario","toronto"},
	{"Prince Edward Island","charlottetown"},
	{"Quebec","quebec city"},
	{"Saskatchewan","regina"}};
	
	int counter = counter(table);
	
	System.out.printf("you got %d questions right", counter);
		
	}
	
	public static boolean isValid(String ansUser, String table[][]) {
		boolean status = false;
		
		for (int i = 0; i < table.length; i++) {
			if(ansUser.toLowerCase().equals(table[i][1])) 
				status = true;
							
		}
		return status;
	}
	
	public static int counter(String table[][]) {
		
		Scanner in = new Scanner(System.in);
		int counter = 0;
		String ans = "";
		
		for (int i = 0; i < table.length; i++) {
			System.out.printf("What is the capital of %s? ",table[i][0]);
			ans = in.nextLine();
			if(isValid(ans,table)) 
				counter++;
		}
		
		in.close();
		return counter;
	}
}
