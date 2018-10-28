package lec12;

public class Ex2 {
	public static void main(String[] args) {
		
		System.out.println(max(3,5));
		System.out.println(max(3.1,5.2));

	}
	public static int max(int a,int b) {
		if(a>b) return a;
		else return b;
	}
	public static int max(int a,int b, int c) {
		return max(max(a,b), c); // finds max between (a & b) then finds the max betweem (ab & c)
	}
	
	public static double max(double a, double b) {
		if(a>b) return a;
		else    return b;
	}
	
}
