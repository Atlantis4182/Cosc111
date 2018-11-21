package ex8;

public class Q1 {
	public static void main(String[] args) {
		int[][] m1 = { { 14, 11, 13, 12 },
					   { 18, 15, 13, 13 },
					   { 19, 16, 15, 17 } };
		
		int[][] m2 = { { 54, 53, 51, 52 },
					   { 51, 59, 52, 56 },
					   { 53, 54, 52, 58 } };
		
		System.out.println("First array:");
		displayArray(m1);
		System.out.println("Second array:");
		displayArray(m2);
		
		if (equals(m1,m2)) 
			System.out.println("The arrays are equal");
		else
			System.out.println("The arrays aren't strictly identical");
		
		
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		boolean status = true;
		int elemAmount = m1.length * m1[0].length;
		int counter = 0;
		
		for (int r = 0; r < m1.length; r++) {
			for (int c = 0; c < m1[0].length; c++) { 
				int condition = m1[r][c] - m2[r][c]; // The idea is to have them subtract each other, if they = 0, they are equal. if they are equal all 12 times. then status =true
				if(condition != 0) 
					status = false;
				if(status == false)
					break;
			}
			if(status == false)
				break;
		}
		return status;
	}
	
	public static void displayArray(int[][] m) {
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++)
				System.out.print(m[r][c] + " ");
			System.out.println();
		}
	}
}
