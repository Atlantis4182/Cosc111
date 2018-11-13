package a4Practice;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("scissors(0), rock(1), paper(2): ");
		int user = in.nextInt();
		while (user<0 || user>2) {
			System.out.print("Invalid input, try again(0-2): ");
			user = in.nextInt();
		}
		in.close();
		
		int comp = (int)Math.floor((Math.random()*3));
		String userRole = role(user);
		String compRole = role(comp);
		
		if (isWin(user,comp)) {
			System.out.printf("The computer is %s. You are %s. You win! :D",compRole,userRole);        // user-comp: 1-0, 2-1, 0-1
		} else if (isLose(user,comp)) {
			System.out.printf("The computer is %s. You are %s. You lose D:",compRole,userRole);
		} else
			System.out.printf("The computer is %s. You are %s. It's a draw... ggwp",compRole,userRole);
	}
	
	public static String role(int side) {
		String role = "";
		if(side == 0)
			role = "scissors";
		else if (side == 1) 
			role = "rock";
		else
			role = "paper";
		return role;
	}
	
	public static boolean isWin(int user, int comp) {
		boolean status = false;
		
		if(user == 1 && comp ==0)
			status = true;
		if(user == 2 && comp ==1)
			status = true;
		if(user == 0 && comp ==2)
			status = true;
		
		return status;
	}
	public static boolean isLose(int user, int comp) {
		boolean status = false;
		
		if(comp == 1 && user ==0)
			status = true;
		if(comp == 2 && user ==1)
			status = true;
		if(comp == 0 && user ==2)
			status = true;
		
		return status;
	}
}
