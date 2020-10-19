import java.util.Scanner;

public class StringExercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = input.nextLine();
        System.out.println("Enter the second string");
        String str2 = input.nextLine();
        StringBuffer sb = new StringBuffer(str1);
        System.out.println("Comparing " + str1 + " to " + sb + ": " + str1.contentEquals(sb));
        System.out.println("Comparing " + str2 + " to " + sb + ": " + str2.contentEquals(sb));

    }
}