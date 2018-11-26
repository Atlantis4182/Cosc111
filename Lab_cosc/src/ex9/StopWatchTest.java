package ex9;

import java.util.Arrays;

public class StopWatchTest {
	public static void main(String[] args) {
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		int[] array = new int[1000000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.random()*101;
		}
		Arrays.sort(array);
		sw.stop();
		
		System.out.println("The elapsed time is " + sw.getElapsedTime() + " ms");
		
		
	}


}
