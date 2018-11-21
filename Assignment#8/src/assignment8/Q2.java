package assignment8;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {

		// This code is probably too long and most of it is unnecessary for what it should be but hey, it works :p
		
		Scanner in = new Scanner(System.in);
		int[][] m1 = { { 14, 11, 13, 12 }, { 18, 15, 13, 13 }, { 19, 16, 15, 17 } };
		int[][] m2 = { { 54, 53, 51, 52 }, { 51, 59, 52, 56 }, { 53, 54, 52, 58 } };
		System.out.println("First array:");
		displayArray(m1);
		System.out.println("Second array:");
		displayArray(m2);

		System.out.print("Column(1-4): ");
		int userColumn = in.nextInt();
		while(userColumn < 1 || userColumn > 4) {
			System.out.println("Invalid. Try again(1-3): ");
			userColumn = in.nextInt();
		}	
		
		System.out.print("Array(1 or 2): ");
		int userArray = in.nextInt();
		while(userArray>2 || userArray<1) {
			System.out.println("Invalid. Try again(1 or 2): ");
			userArray = in.nextInt();
			}
		in.close();
		
		int[][] selectedArray = selectedArray(userArray,m1,m2);  // Selects the array that the user chose		
		String column = convertColumnToString(userColumn); // method for int to String, for column
		String array = convertArrayToString(userArray);  // method for int to String, for array
		
		System.out.printf("The sum of the %s column of the %s array is: %d", column, array, sumCol(selectedArray,userColumn));
	}
	
	public static int[][] selectedArray(int x, int m1[][], int m2[][]) {
		int[][] selectedArray = new int[3][4];
		if(x == 1) {
			for (int r = 0; r < selectedArray.length; r++) {
				for (int c = 0; c < selectedArray[0].length; c++) {
					selectedArray[r][c] = m1[r][c];
				}
			}
		} else
			for (int r = 0; r < selectedArray.length; r++) {
				for (int c = 0; c < selectedArray[0].length; c++) {
					selectedArray[r][c] = m2[r][c];
				}
			}
		return selectedArray;
	}
	

	public static int sumCol (int[][] m, int colIdx) {
		int numX = 0;
 		int columnTrue = colIdx - 1; // colIdx is currently 1 when we mean index 0, so i needed to subtract by 1
		for (int r = 0; r < m.length; r++) {
				numX += m[r][columnTrue];          
		}
		return numX;
	}
	
	public static String convertColumnToString(int column) {

		String stringColumn = "";
		
		if(column == 1) {
			stringColumn = "first";
		} else if (column == 2) {
			stringColumn = "second";
		} else if (column == 3) {
			stringColumn = "third";
		} else {
			stringColumn = "fourth";
		} 
		return stringColumn;
	}
	
	public static String convertArrayToString(int array) {
		String stringArray = "";
		if (array == 1) 
			stringArray = "first";
		else
			stringArray = "second";
		return stringArray;
	}
	
	public static void displayArray(int[][] m) {
		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++)
				System.out.print(m[r][c] + " ");
			System.out.println();
		}
	}
	
}
