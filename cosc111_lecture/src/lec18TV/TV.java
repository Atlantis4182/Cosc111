package lec18TV;

public class TV {

	//attributes
	private int channel;
	int volumeLevel;
	private boolean on;
	
	//constructors
	
	public TV() {
		channel = volumeLevel = 1;
		on = true;
	}
	

	
	
	//methods
	public void turnOn() {on = true;}
	public void turnOff() {on = false;}
	public void setChannel(int newChannel) {
		if(!on)
			System.out.println("Cannot change channel bc. TV is off!");
		else if(newChannel<1 || newChannel>120)
		System.out.println("Invalid channel value!");
		else
			channel = newChannel;
	}
	public void setVolume(int newVolLevel) {
		if(!on)
			System.out.println("Cannot change channel bc. TV is off!");
		else if(newVolLevel < 0) {
			volumeLevel = 0;
		}else if(newVolLevel > 100) {
			volumeLevel = 100;
		}else
			volumeLevel = newVolLevel;
	}

	public void channelUp() {
//		channel++;
//		if(channel>120) channel = 1;
		setVolume(channel+1);
}

	public void channelDown() {
//		channel--;
//		if(channel<1) channel = 120;
		setVolume(channel-1);
	}
	
	public void volumeUp() {	// needs to have limits, like on/off. so make another method with all those conditions
//		volumeLevel++;
//		if(volumeLevel>7) volumeLevel = 7;
		setVolume(volumeLevel+1);
	}
	
	public void volumeDown() {
//		volumeLevel++;
//		if(volumeLevel<1) volumeLevel = 1;
		setVolume(volumeLevel-1);
	}
	
	public String toString() {
		return "TV is " + (on?"ON":"OFF") + " Ch: " + channel + " Vol: " + volumeLevel;
				
	}
}
