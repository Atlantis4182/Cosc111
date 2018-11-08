package lec16Farmville;

public class cowTest {
	public static void main(String[] args) {
		Cow cow = new Cow();
		cow.nickname = "Lizzy";
		cow.hunger = 40;
		cow.isFull = false;
		
		cow.eat(30);
		cow.say("Moo!");
		
		System.out.println(cow.hunger);
		System.out.println(cow.isFull);
	}
}
