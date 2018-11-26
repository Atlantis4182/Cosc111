package lec16Farmville;
//Phase 1; Blueprint
public class Farmer {
	//attributes (instance variables)
	String name;
	double weight;
	int x,y;            //location
	
	//contructors (special method)
	Farmer(String nameVar, double weightVar, int xVar, int yVar) {
		name = nameVar;
		weight = weightVar;
		x = xVar;
		y = yVar;
	}
	
	//actions or behviour (methods)
	public void moveRight() {x++;}
	public void moveLeft() {x--;}
	public void moveUp() {y++;}
	public void moveDown() {y--;}
	public void moveTo(int a, int b) {
		x = a;
		y = b;
	}
}

