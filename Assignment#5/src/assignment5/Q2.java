package assignment5;

public class Q2 {
	public static void main(String[] args) {
	
		for (int i = 1; i <= 10000; i++) {
			int sum = 0;
		
			for(int a = 1; a < i; a++) {
				if ((i%a) == 0) {
					sum = sum + a;
				}
				
			}
			if (sum == i) 
				System.out.println(sum);
		}  
		
	}
}