public class practice_4 {
    public static void main(String[] args) {
        int age = 20;
        int age1 = 40;
        //ture && true = true.
        //true && false = false.
        //both side have to be true in && operator.
         System.out.println(age >=18 && age<=35);
         System.out.println(age1 >= 18 && age1<=30);

         //ture || false = true.
         // true || true = true.
         // false || false = false (only case).
         // false || true = true.
         int number = 12;
         int number1 = 10;
         System.out.println(number >=10 || number <=20); // one conditon is false.
         System.out.println(number1 >=5 || number1<=9.999); // both conditon is false.
    }
}
