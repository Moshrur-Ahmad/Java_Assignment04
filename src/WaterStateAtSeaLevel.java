import java.util.Scanner;

public class WaterStateAtSeaLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the temperature unit (C for Celsius, F for Fahrenheit): ");
        char unit = scanner.next().charAt(0);
        if (unit == 'F' || unit == 'f') {
            temperature = (temperature - 32) * 5 / 9;
        }

        // Determine state of water at given temperature
        String state;
        if (temperature < 0) {
            state = "solid";
        } else if (temperature >= 100) {
            state = "gaseous";
        } else {
            state = "liquid";
        }
        System.out.println("At sea level, water is in " + state + " state at " + temperature + " degrees Celsius.");
    }
}
