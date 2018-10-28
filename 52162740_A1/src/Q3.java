
public class Q3 {

	public static void main(String[] args) {

		double g = 9.81;
		int t = 12;
		
		// This is how the sample output shows the answer:
		
		System.out.println("Distance after 12 seconds: "+ ((g)*(t)*(t))/2);	
		
		//This is a more correct answer considering significant figures:
		
		System.out.println("Distance after 12 seconds: "+ ((g)*(Math.pow(t,2)))/2);	

		
	}

}
