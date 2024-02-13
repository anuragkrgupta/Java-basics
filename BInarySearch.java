//binary search;

import java.util.Arrays;

public class practice_14 {
    public static void main(String[] args) {
        char vowel[] = {'u' , 'o' , 'e' , 'a' , 'i'};

        Arrays.sort(vowel);

        char key = 'o';

        int foundItemIndex = Arrays.binarySearch(vowel , key);

        System.out.println(Arrays.toString(vowel));
        System.out.println(foundItemIndex);
    }
}
