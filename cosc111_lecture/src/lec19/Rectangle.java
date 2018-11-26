package lec19;

public class Rectangle extends Shape{

		//attributes
		private double w,h;              // *All comments are in the Class: Shape*
//		private boolean filled;
		
		//constructors
		public Rectangle(double w, double h) {
			this.w = w;
			this.h = h;
		}
		//methods
		
		public double getW() {
			return w;
		}
		public void setW(double w) {
			this.w = w;
		}
		public double getH() {
			return h;
		}
		public void setH(double h) {
			this.h = h;
		}
		
		//redundancy
//		public String getColour() {return colour;}
//		public void setColour(String colour) {this.colour = colour;}//add code to check for valid colour
//		public void setFilled(boolean filled) {this.filled = filled;}
//		public boolean isFilled() {return filled;}
}
