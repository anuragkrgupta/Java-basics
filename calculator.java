//calculator +,-,*,/;
import java.util.Scanner;

public class practice_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the first number= ");
        float number1 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("enter your second number= ");
        float number2 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("what operation you want to perform? ");
        String operation = scanner.nextLine();

        if(operation.equals("sum")){
            System.out.printf("%f + %f = %f",number1,number2,number1 + number2);
        }
        else if(operation.equals("sub")){
            System.out.printf("%f - %f = %f",number1,number2,number1 - number2);
        }
        else if(operation.equals("mul")){
             System.out.printf("%f * %f = %f",number1,number2,number1 * number2);
        }
        else if(operation.equals("div")){
            if(number2 == 0 ){
                System.out.println("can not divide by zero");{}
            }else{
             System.out.printf("%f / %f = %f",number1,number2,number1 / number2);
            }
        }else{
            System.out.println("This operation can not be performed.");
        }
        scanner.close();

    }
}