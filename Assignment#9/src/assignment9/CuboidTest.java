package assignment9;
public class CuboidTest {
	public static void main(String[] args) {
		

		// JP, definitely not pretty coding for both of these questions, but it works. 
		// I could have made it simpler but making values give a certain decimal place made
		// it a bit of a challenge and resorted to doing this. I couldn't find anything that works
		// and is simpler. Also, the "Cuboid #" was a problem too lol. 
		
		Cuboid c = new Cuboid(); 
		Cuboid userC = new Cuboid(8,3.5,5.9,"Green");
		
		int[] counter = new int[100000];
		for (int i = 1; i < counter.length; i++) {
			counter[i] = i;
		}
		cuboidType(c,counter[1]);
		cuboidType(userC, counter[2]);		
		
	}
	public static void cuboidType(Cuboid cuboid,int counter) {
		String l = String.format("%.2f",cuboid.getL());
		String w = String.format("%.2f",cuboid.getW());
		String h = String.format("%.2f",cuboid.getH());
		String area = String.format("%.2f",cuboid.getSurfaceArea());
		String volume = String.format("%.2f",cuboid.getVolume());
		
		System.out.println(cuboid.displayInfo(counter,cuboid.colour,l,w,h,area,volume));
	}		


}
