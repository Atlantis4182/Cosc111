package lec19;

public class Circle extends Shape{
	//attributes
	private int radius;            //  *All comments are in the Class: Shape*
//	private String colour;
//	private boolean filled;

	
	//"this.variable" means that it is the global variable and not the local. Used when local and global variable are the same
	//constructors
	public Circle() {
		super();
		radius = 10;
	}

	//setter and getter methods
	public int getRadius() {return radius;}
	public void setRadius(int radius) {this.radius = radius;}
//	public String getColour() {return colour;}
//	public void setColour(String colour) {this.colour = colour;}//add code to check for valid colour
//	public void setFilled(boolean filled) {this.filled = filled;}
//	public boolean isFilled() {return filled;}
	//other methods
	public double getArea() {return Math.PI*radius*radius;}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + " colour=" + getColour() "]";  //colour cannot be accessed with a PRIVATE var.
	}
}
