package ex9;

public class StopWatch {
	private int startTime, endTime;
	
	//constructors
	
	
	
	//methods
	
	public void start() {
		startTime = (int)System.currentTimeMillis(); 
	}
	public void stop() {
		endTime = (int)System.currentTimeMillis();
	}
	public int getElapsedTime() {
		int timePass = endTime - startTime;
		return timePass;
	}
	
}
