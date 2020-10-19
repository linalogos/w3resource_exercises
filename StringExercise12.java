import java.util.Scanner;

public class StringExercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = input.nextLine();
        System.out.println("Enter second string");
        String str2 = input.nextLine();
        System.out.println("Enter string ending");
        String str_end = input.nextLine();
        boolean result1 = str1.endsWith(str_end);
        boolean result2 = str2.endsWith(str_end);
        System.out.println("String " + str1 + " ends with " + str_end + ": " + result1);
        System.out.println("String " + str2 + " ends with " + str_end + ": " + result2);

    }
}