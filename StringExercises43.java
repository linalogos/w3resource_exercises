import java.util.*;
public class StringExercise43 {
    static final int N = 256;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = input.nextLine();
        System.out.println("Max occurring character in the given string is: " + maxOccuringChar(str1));
    }

    static char maxOccuringChar(String str1) {
        int ctr[] = new int[N];
        int length = str1.length();
        for (int i = 0; i < length; i++)
            ctr[str1.charAt(i)]++;
        int max = -1;
        char result = ' ';
        for (int i = 0; i < length; i++) {
            if (max < ctr[str1.charAt(i)]) {
                max = ctr[str1.charAt(i)];
                result = str1.charAt(i);
            }
        }
        return result;
    }
}
