package worksheet;

import java.util.Arrays;

public class RoughDraft {
	public static void main(String[] args) {

		int[] myList = {4,32,13,89};
		int[] secondList = {89,13,32,4};

		System.out.println("Before Arrays.sort: "+Arrays.toString(myList));
		Arrays.sort(myList);
		Arrays.sort(secondList);
		System.out.println("After Array.sort: "+Arrays.toString(myList));
		System.out.println("Arrays.equals (If both arrays are equal): "+Arrays.equals(myList, secondList));
		System.out.println("Arrays.bianrySearch: "+ Arrays.binarySearch(myList, 13));
		int i;
		int y = 0;
        for (i = 1; i < 5; i+=2); {
            y+=i; // 5 before sysout
         }
        System.out.print(y);

		
		}


	}
