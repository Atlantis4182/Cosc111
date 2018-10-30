package lec14;

import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
		int z = 0;
		System.out.println(z);
		incrPrimitive(z);
		System.out.println(z);
		
		int[] x = {1,2,3,4,5};
		System.out.println(array2String(x));
		incrElements(x);
		System.out.println(array2String(x));
		
	}
	
	public static String array2String(int[] arr) {
		String temp = "";
		for(int item:arr) temp += item + " ";
		return temp;
	}

public static void incrPrimitive(int a) {                // primitive variables dont change
	a++;
	
	}
	public static void incrElements(int[] arr) {         // arry variables change, even with void
		for (int i = 0;  i< arr.length; i++) {
			arr[i]++;			
	}
}}
