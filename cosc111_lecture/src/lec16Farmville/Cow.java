package lec16Farmville;

public class Cow {
	String nickname;
	private int hunger;
	boolean isFull;
	int eat;
	String say;
	
	
	
	public Cow(){
		hunger = 50;
		nickname = "anonymous";
		isFull = false;
	}
	public Cow(String nameVar, int hungerVar) {
		nickname = nameVar;
		if(hungerVar<0)
			System.out.println("Invalid entry.");
		else if (hungerVar<100) {
			hunger = hungerVar;
			isFull= false;
		} else if (hungerVar>= 100) {
			hunger = 100;
			isFull = true;
		}
	}
	public void setHunger(int s) {
		if (s<0)
			System.out.println("Invalid number: ");
		hunger = s;
	}
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
	public String toString() {
		return "Nickname: " + nickname +
				"\nHunger: " + hunger +
				"\nisFull? " + isFull;
	}
	public int getHunger() {
		return hunger;
	}
	
	public boolean getFull() {
		return isFull;
	}
	
	public String getNickname() {
		return nickname;
	}
}
