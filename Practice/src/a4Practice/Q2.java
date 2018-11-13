package a4Practice;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a valid plate number: ");
		String user = in.nextLine();  //valid: AB-34
		in.close();
		
		if(isValid(user)) {
			System.out.printf("%s is a valid plate number",user);
		} else
			System.out.printf("%s is not a valid plate number",user);
	}
	
	public static boolean isValid(String user) {
		boolean status = false;
		if (user.length() == 5) {
			if(Character.isLetter(user.charAt(0)) && Character.isLetter(user.charAt(1))) {
				if(Character.isUpperCase(user.charAt(0)) && Character.isUpperCase(user.charAt(1))) {
					if(user.charAt(2) == '-') {
						if(Character.isDigit(user.charAt(3)) && Character.isDigit(user.charAt(4))) {
						status = true;
						}
					}
				} 
			} 
		}
		return status;
	}	
}
