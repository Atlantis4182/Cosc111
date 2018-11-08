package assignment7;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		 String s1 = "How many numbers in the list? ";
		 String s2 = "Enter the list: ";
		 double[] numbers = getNumsFromUser(s1, s2);
		 
		 if (isSorted(numbers)) {
			 System.out.println("The list is already sorted");
		 } else
			 System.out.println("The list is not sorted");
		
	}
	
	public static boolean isSorted(double[] list) {
		boolean status = false;
		
		int counter = 0;
		int counterOrder = 0;
		int lengthNum = list.length;
				
		for(int i=0; i < list.length; i++) {			// num = 1 2 3 4
			for(int j = 0; j < (list.length); j++) {    // ind = 0 1 2 
				if (list[i]<=list[j]) {
					counter++;
					if (counter == (lengthNum)) {
						counter=0;
						counterOrder++;
						lengthNum -= 1;
					}
				}  
			}
			counter = 0;
		}
		
		
		if(counterOrder == list.length) {
			status = true;
		}
		return status;
	}

	
	public static double[] getNumsFromUser(String msg1, String msg2){
		Scanner in = new Scanner(System.in);
		
		double[] array;
		int total;
		double num;
		
		System.out.print(msg1);
		total = in.nextInt();                    // 4
		array = new double[total];
					
		System.out.print(msg2);
		for (int i = 0; i < array.length; i++) { // 67 93 55 78
			num = in.nextDouble();
			array[i]= num;
		}
		
		in.close();
		return array;
		
	}
}
