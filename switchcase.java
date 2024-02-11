import java.util.Scanner;

public class practice_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string: ");
        String inputString = scanner.nextLine();

        countAndPrintVowels(inputString);
        scanner.close();
    }
    private static void countAndPrintVowels(String input)
    {
        input = input.toLowerCase();

        int[] vowelCount = new int[5];

        for(int i=0;i<input.length(); i++)
        {
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                switch (ch)
                {
                    case 'a':
                    vowelCount[0]++;
                    break;
                    case 'e':
                    vowelCount[1]++;
                    break;
                    case 'i':
                    vowelCount[2]++;
                    break;
                    case 'o':
                    vowelCount[3]++;
                    break;
                    case 'u':
                    vowelCount[4]++;
                    break;


                }
            }
        }
        System.out.println("Vowel Counts: ");
        System.out.println("A: "+ vowelCount[0]);
        System.out.println("E: "+ vowelCount[1]);
        System.out.println("I: "+ vowelCount[2]);
        System.out.println("O: "+ vowelCount[3]);
        System.out.println("U: "+ vowelCount[4]);

    }
}
