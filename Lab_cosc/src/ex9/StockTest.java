package ex9;

public class StockTest {
	public static void main(String[] args) {
	
		Stock s1 = new Stock("SUNW", "Sun MicroSystem Inc.");
		
		//s1.setterName("Sun MicroSystem Inc.");
		s1.setterLastPrice(34.5);
		s1.setterNowPrice(34.35);
		System.out.println("Stock name: " + s1.getterName());
		System.out.println("Previous Closing Price: " + s1.getterPrev());
		System.out.println("Current Price: " + s1.getterCurrent());
		System.out.println("Price Change: " + s1.getChangePercent() + "%");	
	}
}
