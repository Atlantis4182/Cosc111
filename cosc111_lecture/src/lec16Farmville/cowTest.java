package lec16Farmville;

public class cowTest {
	public static void main(String[] args) {
		Cow cow = new Cow("Bolt", 90);
		cow.nickname = "Lizzy";
		cow.setHunger(40);
		cow.isFull = false;
		
		cow.eat(30);
		cow.say("Moo!");
		
		System.out.println(cow.getHunger());
		
//		System.out.println(cow.setStomach(50));
		System.out.println(cow.isFull);
		
	}
}
