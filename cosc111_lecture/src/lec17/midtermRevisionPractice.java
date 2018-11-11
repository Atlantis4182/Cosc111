package lec17;

public class midtermRevisionPractice {
	public static void main(String[] args) {
		
//			//for-each
//		  	int[] x = new int [10];
//				int i = 0;
//					for(int e: x) {
//					System.out.println(i++);
//					}
		
		// "continue" skips the rest of the iteration and does the loop again
		// "break" leaves the loop
					
		// "pass by value" - methods - search up
		//		primitive - values (simple variables)
		//      reference variables - address ( arrays i think)
		
		// variable scopes
		
		// 1-D arrays
		//     create, initialize, address arrays
		// practice question: first array: 5 elements, reverse the order and only take the positive values:
		
//		int[]a = new int[] {9,-1,3,-2,5,0};
//		
//		int c = 0;
//		for (int elem: a) {
//			if (elem > 0)      
//			c++;
//		}
//		
//		int pointer = c;
//		
		
		
		// Arrays - toString, search, sort 
		
		//int for seeing how many letters in a string matches the given char.
		int indexOf(String s, char ch) {
			for(int i=0; i<s.length(); i++)
					if(s.charAt(i) == ch) return i;
			return -1;
		}
		
		//getting the int for the n'th char from a string
		int indexOf(String s, charch, intn) {
			int counter = 0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == ch);
					counter++;
				if (counter == n)
						return i;
		}
		return -1;
		}
		
		
		
	}
}
