package tapAcdmy;

import java.util.Scanner;

/*
 Write a TemperatureConversion program, given the temperature in Fahrenheit as
input outputs the temperature in Celsius or vice versa using the formula
Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
Fahrenheit to Celsius: (°F − 32) x 5/9 = °C.
 */
public class Celsi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temperature=sc.nextDouble();
		double Celsius_to_Fahrenheit= (temperature * 9/5) + 32;
		double Fahrenheit_to_Celsius= (temperature - 32) * 5/9;
		System.out.println(Celsius_to_Fahrenheit);
		System.out.println(Fahrenheit_to_Celsius);
		
		
		
		
		
		
		
	}

}
