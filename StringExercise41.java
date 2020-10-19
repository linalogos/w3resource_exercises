import java.util.*;
public class StringExercise41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = input.nextLine();
        System.out.println("Enter the second string");
        String str2 = input.nextLine();
        char arr[] = new char[str1.length()];
        char[] mask = new char[256];
        for (int i = 0; i < str2.length(); i++)
            mask[str2.charAt(i)]++;
        System.out.println("\nThe new string is: ");
        for (int i = 0; i < str1.length(); i++) {
            if (mask[str1.charAt(i)] == 0)
                System.out.print(str1.charAt(i));
        }
    }
}
