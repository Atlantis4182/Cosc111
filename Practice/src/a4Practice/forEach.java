package a4Practice;

public class forEach {
	public static void main(String[] args) {
		
		int[] marks = {12,14,20,2,5};
		int maxSoFar = 0;
		int maxSoFar2 = 0;

		//for-loop
			for (int i = 0; i < marks.length; i++) {
				if(marks[i]>maxSoFar) {
					maxSoFar= marks[i];
				}
			}
			System.out.println("maxSoFar: " + maxSoFar);
			//ForEach
				for(int num: marks) {
					if(num>maxSoFar2) {
						maxSoFar2=num;
					}
				}
				System.out.println("maxSoFar2: " + maxSoFar2);
				
	}
}
