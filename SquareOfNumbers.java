import java.util.Scanner;
public class practice_18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a number");
            int num= sc.nextInt();
            System.out.println("number = "+num+" ,square of number = "+num*num+" ");
        }
    }
}