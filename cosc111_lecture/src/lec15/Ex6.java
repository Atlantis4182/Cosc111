package lec15;

public class Ex6 {
	public static void main(String[] args) {
		int[][] x = {	   //3x4array
				{1,2,3,5}, //11
				{3,4,5,6}, //18
				{7,8,9,12} //..
				
		};
		for (int r = 0; r < x[0].length; r++) { // assuming a rectangular array
			int sum = 0;
			for (int c = 0; c < x.length; c++) {
				sum += x[r][c];
			}
			System.out.printf("Sum of row #%d: %d\n", r, sum);
		}
	}
}
