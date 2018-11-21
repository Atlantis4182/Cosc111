package lec17;

public class FarmerTest {
	public static void main(String[] args) {
		
		Farmer f1 = new Farmer("Mark",60.5,5,9);
		Farmer f2 = new Farmer();
		Farmer f3 = new Farmer("Lili", 70.5);
		
		f2 =f1;
		
		f1 = new Farmer("John", 10);
		
		f2.name = "ABC";
		
		
		f1.printInfo();
		f2.printInfo();
		
	}
}
