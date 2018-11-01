package lec15;

public class Ex3 {
	public static void main(String[] args) {
		
		int[][] grades = new int[4][3]; // 4 rows 3 columns: initialized to 0
		grades[2][1] = 9;
		
		System.out.println(grades[0][0]);
		System.out.println(grades[2][1]);
		
		int[][] nums = {              // rows and columns start at 0, like the arrays they are
			//   0 1 2
				{1,2,3}, // 0,1,2
				{4,5,6}, // 0,1,2
				{7,8,9,3}, // 0,1,2,3
				{1,2,3,4}, // 0,1,2,3
				{4,3,2,1}, // 0,1,2,3
				{6,5,4,3} // 0,1,2,3
				
		};
		System.out.println(nums[5][1]);
	}
}
