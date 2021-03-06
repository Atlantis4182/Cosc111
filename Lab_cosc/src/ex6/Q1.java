package ex6;

public class Q1 {
	public static void main(String[] args) {

		System.out.println("Celsius\t   Fahrenheit          | Fahrenheit   Celsius");
		System.out.println("-----------------------------------------------------");
		for (int i = 20, s = 50; i < 30 && s < 96; i++, s += 5) {
				double digitF = toFahrenheit(i);
				double digitC = toCelsius(s);
				System.out.printf("%d\t   %.2f\t       |%d\t       %.2f\n",i,digitF,s,digitC);
		}
	}
	public static double toFahrenheit(double celsius) {

		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}

	public static double toCelsius(double fahrenheit) {

		double celsius = (5.0 / 9) * (fahrenheit - 32);			
		return celsius;
	}

}