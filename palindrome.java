public class practice 
{ 
    private static boolean Prime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Check if a number is a palindrome
    private static boolean Pol(int num) {
        int or = num;
        int rev = 0;

        while (num > 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }

        return or == rev;
    }



	    public static void main(String[] args) {
	        int count = 0;
	        int number = 2;

	        while (count < 100) {
	            if (Prime(number) && Pol(number)) {
	                System.out.print(number + " ");
	                count++;
	                if (count % 10 == 0) {
	                    System.out.println();
	                }
	            }

	            number++;
	  }
	}
}
