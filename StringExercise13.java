import java.util.Scanner;

public class StringExercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = input.nextLine();
        System.out.println("Enter second string");
        String str2 = input.nextLine();
        System.out.println("Enter third string");
        String str3 = input.nextLine();
        // comparing str1 and str2 to str3
        boolean result1 = str1.equals(str3);
        boolean result2 = str2.equals(str3);
        System.out.println("Is " + str1 + " equal to " + str3 + "? " + result1);
        System.out.println("Is " + str2 + " equal to " + str3 + "? " + result2);
    }
}