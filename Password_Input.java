// take the input of passwords with criterias given below:-
// 1.The string must be at least 8 characters long.
// 2.The string must contain at least 2 digits and 2 letters.


import java.util.Scanner;
public class Password_Input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String s = sc.nextLine();
   
   if(s.length()<8)
   {
            System.out.println("The string must be at least 8 characters long.");
            return;
   }
   int digitCount=0; int letterCount=0;
   for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&& ch<='9')
            {
                digitCount++;
            }
            else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                letterCount++;
            }
            
   }
   if (digitCount < 2 || letterCount < 2) {
            System.out.println("The string must contain at least 2 digits and 2 letters.");
            return;
   }
        }
        System.out.println("The string meets the requirements.");
}
}

