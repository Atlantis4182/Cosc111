package ex9;

public class Stock {
	//attributes
	private String symbol, name;
	private double prevClosingPrice, currentPrice;

	
	//constructors
	
	Stock(String symbol1, String name1) {
		name = name1;
		symbol = symbol1;
	}
	
	//methods
	
	public void setterName(String nameCo) {name = nameCo;}
	public void setterLastPrice(double lastPrice) {prevClosingPrice = lastPrice;}
	public void setterNowPrice(double nowPrice) {currentPrice = nowPrice;}
	
	public String getterName() {return name;}
	public double getterPrev() {return prevClosingPrice;}
	public double getterCurrent() {return currentPrice;}
	
	public double getChangePercent() {
		double percentage = ((currentPrice-prevClosingPrice)/prevClosingPrice)*100;
		return percentage;
	}
	
	
	
}
