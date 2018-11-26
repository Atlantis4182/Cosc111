package assignment9;


public class Cuboid {
	//attributes
	double l,w,h;
	String colour;	
	
	//constructors
	Cuboid(double l , double w, double h, String colour){
		this.l = l;
		this.w = w;
		this.h = h;
		this.colour = colour;
	}
	Cuboid(){
		l = 1;
		w = 1;
		h = 1;
		colour = "White";	
	}		
	
	//methods
	public double getL() {return l;}
	public double getW() {return w;}
	public double getH() {return h;}
	public String getColour() {return colour;}
	public double getSurfaceArea() {
		double area = 2*(l*w+l*h+w*h);
		return area;
	}
	public double getVolume() {
		double volume = l*w*h;
		return volume;
	}
	public String displayInfo(int counter, String colour, String l, String w, String h, String area, String volume) {
		return "Cuboid " + counter + "\n  "
			 + "Colour: " + colour + "\n  "
			 + "Dimensions: " + l + " X " + w + " X " + h + "\n  "
			 + "Surface Area: " + area + "\n  "
			 + "Volume: " + volume + "\n";
	}
	
	
}
