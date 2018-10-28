package lec7;

public class Ex4 {

	public static void main(String[] args) {
		
		int x= 10, y = 20;
		if (x < 5 && y++ > 10)       // && short cuts... so when it sees that x= false, it stops reading, preventing y++ [incrementation]
			System.out.println("A");
		else
			System.out.println("B");
		
		System.out.println(x);
		System.out.println(y);
		
	}
}
