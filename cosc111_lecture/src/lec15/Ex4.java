package lec15;

public class Ex4 {
	public static void main(String[] args) {
		int[][] nums = {              // rows and columns start at 0, like the arrays they are
				
					{1,2,3}, // 0,1,2
					{1,2,3}, // 0,1,2
					{1,2,2}, // 0,1,2
					{1,2,5}
								
					
			};		
//		System.out.println(nums.length); // length of rows, # of rows
//		System.out.println(nums[3].length); //# columns. bc you enter the row's specific array asking how long in that row...which is the columns
//		
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = 0; j < nums[0].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		}
}
