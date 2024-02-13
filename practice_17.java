import java.util.Scanner;
public class practice_17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your semester");
            String sem = sc.nextLine();
            try (//Scanner scanner;
            Scanner scanner = new Scanner(System.in)) {
                System.out.println("enter your branch");
                String branch = scanner.nextLine();
                 System.out.println("I am from "+sem+" semester "+branch+".");
            }
        }
    }
}
