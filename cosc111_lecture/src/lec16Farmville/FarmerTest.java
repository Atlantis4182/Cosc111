package lec16Farmville;
//Phase 2; Production
public class FarmerTest {

	public static void main(String[] args) {
//		Farmer f1 = new Farmer();			// "Farmer()" called constructor --> special --> create ONCE
//		f1.name = "Mark";
//		f1.weight = 60.5;
//		f1.x = 5;
//		f1.y = 6;
//		
		Farmer f1= new Farmer("Mark", 60.5, 20, 10);
	
		Cow c1 = new Cow();
		
		
		System.out.println(f1.x + "," + f1.y);
		f1.moveRight();
		f1.moveLeft();
		f1.moveLeft();
		f1.moveUp();
		f1.moveUp();
		f1.moveUp();
		f1.moveUp();
		System.out.println(f1.x + "," + f1.y);
		f1.moveTo(9, 4);
		System.out.println(f1.x + "," + f1.y);
		
		
//		f1.moveTo(6,7);
//		f1.feed(c1);
//		c1.sleep();
	
	
	Cow c2 = new Cow("Bolt", 170);
	System.out.println(c2);
	c1.hunger = -50;
	System.out.print(c1.toString());
	}
}
