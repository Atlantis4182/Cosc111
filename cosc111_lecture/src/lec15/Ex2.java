package lec15;

public class Ex2 {
	public static void main(String[] args) {
		
		int[] b = {1,2,3};
		System.out.println(sum(b));
		
		System.out.println(sum(new int[] {1,2,3}));
		
	}
	public static int sum(int...a) {
		int sum = 0;
		for(int elem: a)
			sum+= elem;
		return sum;
	}
}
