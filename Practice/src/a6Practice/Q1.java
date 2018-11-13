package a6Practice;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter time in seconds: ");
		int userSec = in.nextInt();
		in.close();
		System.out.println(convertTime(userSec));
	}
	
	public static String convertTime(int totalSeconds) {
		
		String time = "";
		int hours = 0;
		int hoursRem = 0;
		int min = 0;
		int sec =0;
		
		hours = totalSeconds/3600;
		hoursRem = totalSeconds%3600;
		min = hoursRem/60;
		sec = hoursRem%60;
		
		time = hours + ":" + min + ":" + sec;
		
		return time;
	}
}
