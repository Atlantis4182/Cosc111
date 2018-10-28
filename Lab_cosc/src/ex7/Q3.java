package ex7;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double[] index = new double[10];
		System.out.print("Enter ten numbers: "); //3 6 2 1 7 1 4 12 16 2
		for (int i = 0; i < index.length; i++) {
			index[i] = in.nextDouble();
		}
		
		System.out.println("the min is " + getMin(index));
		System.out.println("The index of the min is " + indexOfMin(index));
		
		in.close();
	}

	public static int indexOfMin (double[] array) {
		
		double min = array[0];
		int indexMin = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]<min) {
				indexMin = i;
				min = array[i];
			}
		}
		return indexMin;
	}
	
	public static double getMin(double[] array) {
		
		double minElement = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minElement) {
				minElement = array[i];
			}
		}
		return minElement;
	}
	
	
}
