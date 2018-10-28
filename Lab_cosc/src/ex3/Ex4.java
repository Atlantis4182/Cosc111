package ex3;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
	
	System.out.printf("Enter a string: ");
	String str = in.nextLine();
	str = str.toUpperCase();
	int length = str.length();
	char first = str.charAt(0);
	char letter = 'X';
	int set = str.indexOf(letter);

	
		System.out.printf("The length of %s is %d %n"
				+ "The first character in %s %n"
				+ "Does %s includes the letter %c? %d",str,length,first,str,letter,set);

		in.close();
		

		
	}}
