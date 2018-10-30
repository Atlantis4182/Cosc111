package assignment6;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter time in seconds: ");
		int time = in.nextInt();
		
		System.out.println(convertTime(time));
		
		in.close();
		
	}
	
	public static String convertTime(int totalSeconds) {
		
		int hours;
		int hoursRem; // remainder after totalSeconds/60
		int min;
		int sec;
		
		hours = totalSeconds/3600; // # of hours
		hoursRem = totalSeconds%3600; // # of remaining minutes
		
		min = hoursRem/60;
		sec = hoursRem%60;
		
		String digTime = hours + ":" + min + ":" + sec;
		
		return digTime;
	}
}
