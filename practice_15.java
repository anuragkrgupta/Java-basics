import java.util.Arrays;

/**
 * practice_15
 */
public class practice_15 {

    public static void main(String[] args) {
        char vowel[] = {'u' , 'o' , 'e' , 'a' , 'i'};
        

        int startingIndex = 1;
        int endingIndex = 4;
        
        Arrays.fill(vowel , startingIndex , endingIndex , 'x');
        System.out.println(Arrays.toString(vowel));
    }
}