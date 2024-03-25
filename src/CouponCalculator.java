import java.util.Scanner;

public class CouponCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount spent on groceries: $");
        double amountSpent = scanner.nextDouble();

        double couponPercentage = calculateCouponPercentage(amountSpent);
        double couponValue = amountSpent * (couponPercentage / 100);

        if (couponPercentage == 0) {
            System.out.println("No coupon awarded for spending less than $10.");
        } else {
            System.out.printf("Coupon awarded: %.2f%% of $%.2f = $%.2f\n", couponPercentage, amountSpent, couponValue);
        }

        scanner.close();
    }

    public static double calculateCouponPercentage(double amountSpent) {
        if (amountSpent < 10) {
            return 0; // No coupon for less than $10
        } else if (amountSpent >= 10 && amountSpent <= 60) {
            return 8;
        } else if (amountSpent > 60 && amountSpent <= 150) {
            return 10;
        } else if (amountSpent > 150 && amountSpent <= 210) {
            return 12;
        } else {
            return 14;
        }
    }
}
