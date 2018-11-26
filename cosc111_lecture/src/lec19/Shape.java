package lec19;

public class Shape {
	//super-class
	private String colour;   // change to public to fix problems.
	private boolean filled;
	
	public Shape() {
		colour = "W";
		filled = true;
	}
	
	public Shape(String colour, boolean filled) {
		this.colour = colour;
		this.filled = filled;
	}

	public String getColour() {return colour;}
	public void setColour(String colour) {this.colour = colour;}//add code to check for valid colour
	public void setFilled(boolean filled) {this.filled = filled;}
	public boolean isFilled() {return filled;}
	
}
