package assignment3;

public class Q5 {
	public static void main(String[] args) {
		
		
		char a = (char)(Math.random()*26 +'A');
		char b = (char)(Math.random()*26 +'A');
		char c = (char)(Math.random()*26 +'A');
		int  z = (int)(Math.random()*10);
		int  y = (int)(Math.random()*10);
		int  x = (int)(Math.random()*10);
		int  w = (int)(Math.random()*10);
		
		System.out.printf("A random vehicle plate number: %c%c%c%d%d%d%d",a,b,c,z,y,x,w );
		
		
	}
}
