package lec10;

public class Ex4 {
	public static void main(String[] args) {
	int i = 0;
	while(i<5) {
		if (i == 1) continue;
		i++;
		System.out.println(i);
		
	}
	
	for (int j = 0; j<5; j++) //j++ is incremented last, after everything. i will be 5 at the end, but not will be printed 5
		
		System.out.println("Hi");
		
		System.out.println("NEW NEW NEW");
	
	
	
	
	}
}
