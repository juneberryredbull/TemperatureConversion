// Eddie Hart
// Jan 24th, 2024
// CSC 1060

import java.util.Scanner;
// Here I am importing the java.util package in order to use keyboard input.

public class TemperatureConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Here I declare the variable input as a scanner
        System.out.print("Type in temperature in Fahrenheit: ");
        // This quick print statement asks for the user to input Fahrenheit.
        int temperature = input.nextInt();
        // This declared variable will store the user Fahrenheit input as an integer.
        double celsius = (temperature - 32.0) * (5.0 / 9.0);
        double kelvin = celsius + 273.15;
        // These two declared variables store the Celsius and Kelvin values while simultaneously being
        // calculated through basic arithmetic operations.

        System.out.printf("Temperature in Celsius: %.2f \n", celsius);
        System.out.printf("Temperature in Kelvin: %.2f", kelvin);
        // These two print statements will display the conversions.
        // These print statements are also formatted to only show two decimal places.

    }
}
