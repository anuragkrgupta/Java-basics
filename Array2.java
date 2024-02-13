// sorting of array;

import java.util.Arrays;

public class practice_13 {
    public static void main(String[] args) {
        char vowel[] = {'u' , 'o' , 'e' , 'a' , 'i'};

        int startingIndex =1;
        int endingIndex = 4;

         Arrays.sort(vowel , startingIndex , endingIndex);
        System.out.println(Arrays.toString(vowel));
    }
}
