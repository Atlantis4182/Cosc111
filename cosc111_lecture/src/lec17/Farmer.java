package lec17;

public class Farmer {
		//attributes
	String name;
	double weight;
	int x;
	int y;
	
	
	/*contructor is a special type of method
	*custructor needs:
	* (1) Same name as class name
	*  (2) Used once?
	*
	*
	*default constructor when var dont get initialized and: Farmer f = new Farmer();	
	*/
	Farmer(String name, double weight, int x, int y) {
		
	}
	Farmer() {
		name = "a farmer";
		weight = 10;
		x = y = 1;
	}
	Farmer (String n, double w) {
		
	}
	public void printInfo() { //private can only be accessed by this class. For public, other classes can access
		System.out.println(name);
		System.out.println("Weight: " + weight);
		System.out.printf("Location:  (%d,%d)",x,y);
	}
	
}
