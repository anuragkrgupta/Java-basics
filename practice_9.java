import java.util.Scanner;

public class practice_9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
            System.out.print("What is your name? ");
            String name = scanner.nextLine();

            System.out.printf("Your name is "+name+".");
            scanner.close();
        }
    }

