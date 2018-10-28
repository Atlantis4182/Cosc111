package ex5;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = in.nextLine();

		int length = s.length() - 1;
		System.out.print("The reversed string is \"");
		while (length >= 0) {
			char x = s.charAt(length);
			length--;

			System.out.print(x);
		}
		System.out.println("\"");
		

		int count = 0;
		int z = 0;
		String sLowerCase = s.toLowerCase();
		while (z < sLowerCase.length()) {
			if (sLowerCase.charAt(z) == 'a' || sLowerCase.charAt(z) == 'e' || sLowerCase.charAt(z) == 'o'
					|| sLowerCase.charAt(z) == 'u' || sLowerCase.charAt(z) == 'i') {

				count++;
			}
			z++;
		}
		System.out.println("The number of vowels " + count);
		
		
		String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 0-25
		int a = 0;
		
		int countUpper = 0;
		int i = 0;
		
		//     0 < 12            0 < 26
		while (i < s.length()) {
			
			if (s.charAt(i) == alphabetUpper.charAt(a)) { 	 // resets the counter (a) and increments countUpper if a upperCase is found
				countUpper++;
				i++;
				a = 0;
			} else // else: if no upperCase letter is found, it resets the counter(a)
			a++;
			if (a == alphabetUpper.length()) {
			a = 0;
			i++;
			}
		}
		System.out.print("The number of Upper Case letters is " + countUpper);
		
		in.close();
	}
}
