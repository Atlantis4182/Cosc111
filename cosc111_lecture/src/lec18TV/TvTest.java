package lec18TV;

public class TvTest {
	public static void main(String[] args) {
	
		TV tv = new TV();
		tv.turnOff();
		tv.setChannel(100); //limit at 120

		tv.turnOn();
		for(int i = 0; i < 10;i++)
			tv.volumeUp();
		for(int i =0; i <200; i++)
			tv.channelUp();
		
		System.out.println(tv.toString());
	}
}
