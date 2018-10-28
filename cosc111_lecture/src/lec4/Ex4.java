package lec4;

public class Ex4 {

	public static void main(String[] args) {

		long x = 10;
		double y = 5.2;
		
		x = (long)1.2; // explicit conversion (int) losing value. smaller->larger
		System.out.println(x);
		
		y= 9; // implicit conversion, not writing (double)9
		System.out.println(y);
		
	}

}
