package assignment4;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int user = in.nextInt();
		int comp = (int)(Math.random()*3);
	
		int num0 = 0;
		int num1 = 1;
		String userWord;
		String compWord;
		
		if (user == num0) {
			userWord = "scissor";
		} else if (user == num1) {
			userWord = "rock";
		} else
			userWord = "paper";
		
		if (comp == num0) {
			compWord = "scissor";
		}else if (comp == num1) {
			compWord = "rock";
		}else
			compWord = "paper";
		
		
		if ((user == 2 && comp == 1) || (user == 1 && comp == 0) || (user == 0 && comp == 2)) {
			System.out.printf("The Computer is %s. You are %s .You won.",compWord,userWord);
		} else if ((user == 1 && comp == 2) || (user == 0 && comp == 1) || (user == 2 && comp == 0)) {
			System.out.printf("The Computer is %s. You are %s .You lost.",compWord,userWord);
		} else
			System.out.printf("The Computer is %s. You are %s .It is a draw.",compWord,userWord);

		
//		
//		if (user == 2 && comp == 1) {
//			System.out.printf("The Computer is %s. You are %s .You won.",compWord,userWord);
//		} else if (user == 1 && comp == 0) {
//			System.out.printf("The Computer is %s. You are %s .You won.",compWord,userWord);
//		} else if (user == 0 && comp == 2) {
//			System.out.printf("The Computer is %s. You are %s .You won.",compWord,userWord);
//		} else if (user == 1 && comp == 2) {
//			System.out.printf("The Computer is %s. You are %s .You lost.",compWord,userWord);
//		} else if (user == 0 && comp == 1) {
//			System.out.printf("The Computer is %s. You are %s .You lost.",compWord,userWord);
//		} else if (user == 2 && comp == 0) {
//			System.out.printf("The Computer is %s. You are %s .You lost.",compWord,userWord);
//		} else if (user == comp) {
//			System.out.printf("The Computer is %s. You are %s .It is a draw.",compWord,userWord);
//		}
		in.close();
	}
}
