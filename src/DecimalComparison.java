import java.util.Scanner;
public class DecimalComparison {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter two floating-point numbers: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            if (areSameUpToTwoDecimalPlaces(num1, num2)) {
                System.out.println("They are the same up to two decimal places.");
            } else {
                System.out.println("They are different.");
            }
        }

        public static boolean areSameUpToTwoDecimalPlaces(double num1, double num2) {
            // Multiply by 100 to shift decimal two places to the right, then cast to int to truncate decimal part
            int num1Scaled = (int) (num1 * 100);
            int num2Scaled = (int) (num2 * 100);

            return num1Scaled == num2Scaled;
        }
    }


