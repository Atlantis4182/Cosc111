package lec12;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println( (max(3.0,5)) );
		
	}
//	public static double max(int a, int b) {
//		if(a>b) return a;
//		else 	return b;
//	}
//	
	public static double max(int a, double b) { //Perfect match, or closer to perfect, wouldn't go to 2nd method
		if(a>b) return a;
		else    return b;
	}

		public static double max(double a, double b) {
			if(a>b) return a;
			else    return b;
		}
	
}
