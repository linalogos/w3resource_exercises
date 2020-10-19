import java.util.Scanner;

public class StringExercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = input.nextLine();
        System.out.println("Enter the second string");
        String str2 = input.nextLine();
        boolean result = str1.startsWith(str2);
        System.out.println("Does '" + str1 + "' start with '" + str2 + "'? " + result);
    }
}