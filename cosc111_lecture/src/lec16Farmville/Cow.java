package lec16Farmville;

public class Cow {
	String nickname;
	int hunger;
	boolean isFull;
	int eat;
	String say;
	
	public void eat(int amount) {
		hunger += amount;
		if (hunger >= 100) {
			hunger = 100;
			isFull = true;}
	 else {
			isFull= false;
			say("yum yum yum");
	}}
	public void say(String msg) {
		System.out.println(nickname + " says: " + msg);
	}
}
