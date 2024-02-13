import java.util.Scanner;
public class practice_19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your basic salary");
            double basicsalary = sc.nextDouble();
            double DA = (40.0/100)*basicsalary;
            double HRA = (20.0/100)*basicsalary;
            double grossSalary= basicsalary + DA + HRA;
            System.out.println("gross salary"+grossSalary+" ");
        }
    }
}
