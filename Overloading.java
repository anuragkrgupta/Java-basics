   //overloading
   
   class Calculator {
    
        // Method for adding two numbers
        public int add(int a, int b) {
            return a + b;
        }
    
        // Method for adding three numbers
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    
        // Method for subtracting two numbers
        public int subtract(int a, int b) {
            return a - b;
        }
    }
    
    public class practice_26 {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
    
            // Adding two numbers
            System.out.println("Addition of 2 and 3 is " + calc.add(2, 3));
    
            // Adding three numbers
            System.out.println("Addition of 2, 3 and 4 is " + calc.add(2, 3, 4));
    
            // Subtracting two numbers
            System.out.println("Subtraction of 5 from 10 is " + calc.subtract(10, 5));
        }
    }
  
