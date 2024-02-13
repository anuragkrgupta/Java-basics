import java.util.Scanner;

public class practice_20 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the initial position (x0): ");
            double x0 = scanner.nextDouble();

            System.out.println("Enter the initial velocity (v0): ");
            double v0 = scanner.nextDouble();

            System.out.println("Enter the time (t): ");
            double t = scanner.nextDouble();

            double g = 9.78033; // gravity constant in m/s^2

            double displacement = x0 + v0 * t + 0.5 * g * Math.pow(t, 2);

            System.out.println("The displacement is: " + displacement + " meters");
        }
    }
}