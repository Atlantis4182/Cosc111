package lec11;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("Hi there");
		System.out.println("This is our first example on methods");
		printLine(1,30, '*');
		System.out.println("Another useless text");
		printLine(5,10, '+');
	}//end of main() 
	
	
	public static void printLine(int height, int width, char ch) { // inputs are within the ().   "void printLine()" Method signature
		for(int r = 0; r < height; r++) {
			for(int c= 0; c< width; c++)
			System.out.print(ch);
		System.out.println();
		
		}
		System.out.println("hello");
		
	}// end of printLine()
	
	
}

