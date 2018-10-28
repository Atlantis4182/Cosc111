package lec13;

public class Ex1_Arrays {
	public static void main(String[] args) {


		String[] names = new String[100];   //null
		double[] weights = new double[100]; //0.0. # of elements =100, the last element is 99
		weights[2] = 1.2;

		System.out.println(weights[0]);
		System.out.println(names[2]);
	}
}
