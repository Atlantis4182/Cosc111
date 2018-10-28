package lec3;

import java.util.Scanner;


public class Ex3 {

	public static void main(String[] args) {
		
			//Named constant
			final int MAX = 100;
					
		
		// 1) create input obj. CRITICAL to "import java.util.Scanner
			Scanner in = new Scanner(System.in);
			
		// use unput obj to read data from keyboard	
		
			System.out.println("How much you make a day?");
			double salary = in.nextDouble();
			
			in.nextLine(); 
			//reading a number^ followed by a String name, put "in.nextLine();
			
			System.out.println("What is your name?");
			String name = in.nextLine ();
			
					
			System.out.println("Hi " + name + ". How old are you?");
			int age = in.nextInt();
			
			System.out.println("You are " + age + " , make " + salary + " and your name is " + name );
			



}
	
	
}
