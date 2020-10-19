import java.util.*;
public class StringExercise39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = input.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            boolean result = true;
            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    result = false;
                    break;
                }
            }
            if (result) {
                System.out.println("The first non repeated character in String is: " + str1.charAt(i));
                break;
            }
        }
    }
}
