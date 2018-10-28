package ex5;

public class Q1 {
	public static void main(String[] args) {

		int n = 0;
		int x = 12000; // smallest int (n) so that n^2 is greater than x
		while (Math.pow(n,2) <= x) {
			n++;
		}
		System.out.println(n);
	}
}
