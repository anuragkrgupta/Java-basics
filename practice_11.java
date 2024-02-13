import java.util.Scanner;
public class practice_11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter the 1st number= ");
            float number1 = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("enter the 2nd number= ");
            float number2 = scanner.nextFloat();
            scanner.nextLine();

            System.out.println("Wnat type of operation you want to perform? ");
            String operation = scanner.nextLine();

            switch (operation) {
                case "sum":
                System.out.printf("%f + %f = %f", number1 , number2,number1 + number2);
                    
                    break;
                    case "sub":
                    System.out.printf("%f - %f = %f",number1,number2,number1 - number2);
                    break;
            
                default:
                System.out.println("can't perform this operation.");
                    break;
            }
        }
    }
}
