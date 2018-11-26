package ex9;

public class QuadraticEquation {
	private int a,b,c;
	
	
	//constructors
	QuadraticEquation(int a, int b, int c){
		
	}
	
	//methods
	public void getterA(int a1) {a = a1;}
	public void getterB(int b1) {b = b1;}
	public void getterC(int c1) {c = c1;}
	
	public double getDiscriminant(int a1, int b1, int c1) {
		double discr = Math.pow(b1,2) - 4*a1*c1;
		return discr;
	}
	public double getRealRoot1() {
		double root = (-b+Math.sqrt(getDiscriminant(a,b,c)))/(2*a);
		return root;
	}
	public double getRealRoot2() {
		double root = (-b-Math.sqrt(getDiscriminant(a,b,c)))/(2*a);
		return root;
	}
}
