package lec15;

public class Ex1 {
	public static void main(String[] args) {
	
		System.out.println( sum(2,3,4));
		System.out.println( sum(2,3,4,5,6,7,8,9));
	}
	
	public static int sum(int...a) {
		int sum = 0;
		for (int elem:a)
			sum += elem;
		return sum;
	}
	
}
