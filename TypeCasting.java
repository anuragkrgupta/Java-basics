public class practice_21 {
    //type casting
    public static void main(String[] args) {
        //widening type casting
         int x= 1;
         long y = x;
         double z=y;

         System.out.println("integer= "+x);
         System.out.println("long= "+y);
         System.out.println("double= "+z);

         //narrow casting
        double a=2.045684213845435435;
        float e=(float)a;
        long b = (long)a;
        int c = (int)b;
        System.out.println("double "+a);
        System.out.println("long "+b);
        System.out.println("integer "+c);
        System.out.println("float "+e);
        
          
    }
}
