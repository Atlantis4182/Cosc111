package worksheet;

import java.util.Arrays;

public class RoughDraft {
	public static void main(String[] args) {

		int[] myList = {4,32,13,89};
		int[] secondList = {89,13,32,4};
		
		System.out.println(Arrays.toString(myList));
		Arrays.sort(myList);
		System.out.println(Arrays.toString(myList));
		Arrays.sort(secondList);
		System.out.println(Arrays.equals(myList, secondList));
		
		}
		
	}
