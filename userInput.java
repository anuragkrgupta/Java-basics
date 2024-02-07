import java.util.Scanner;

public class practice_7 {
    public static void main(String[] args) {
        
       try (//String country = "INDIA";
               // int age= 20;
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name= ");
            String name = scanner.nextLine();
            System.out.print("Enter your country= ");
            String country = scanner.nextLine();
            System.out.print("Enter your age= ");
            int age = scanner.nextInt();
                
            
            System.out.printf("My name is %s, I am from %s and my age is %d .",name,country,age);
        }
    }
}
