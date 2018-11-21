package assignment8;

public class Q1 {
	public static void main(String[] args) {
		int[][] m1 = { { 14, 11, 13, 12 }, { 18, 15, 13, 13 }, { 19, 16, 15, 17 } };
		int[][] m2 = { { 54, 53, 51, 52 }, { 51, 59, 52, 56 }, { 53, 54, 52, 58 } };
		System.out.println("First array:");
		displayArray(m1);
		System.out.println("Second array:");
		displayArray(m2);
		System.out.println();
		
		
		if(m1.length == m2.length && m1[0].length == m2[0].length) {
		System.out.println("The addition of the above two arrays is");
		displayArray(addMatrix(m1,m2));
		} else
			System.out.println("The matrix's lengths do not match");
	}

	
	public static int[][] addMatrix(int[][] a, int[][] b) {
		
		
		int lengthRow = a.length;
		int lengthColumn = a[0].length;
		int r = 0;
		int c = 0;
		int[][] m3 = new int[lengthRow][lengthColumn];
		
		for (r = 0; r < m3.length; r++) {
			for (c = 0; c < m3[0].length; c++) {
			m3[r][c] = a[r][c] + b[r][c];
			}
		}		
		return m3;
	}
	
		
	
	public static void displayArray(int[][] m) {
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++)
				System.out.print(m[r][c] + " ");
			System.out.println();
		}
	}
}
