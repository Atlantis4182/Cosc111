package lec5;

public class Ex1 {

	public static void main(String[] args) {

		char ch = 'a';
		System.out.println(ch);
		
		System.out.println(Character.isUpperCase(ch));
		System.out.println(Character.isLowerCase(ch));
		
		char ch2 = Character.toUpperCase(ch);
		System.out.println(ch2);

	}
}
