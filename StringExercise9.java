import java.util.Scanner;

public class StringExercise9 {
    // trying to pass CharSequence to Scanner (not successful)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string");
        String firstString = input.nextLine();
        System.out.println("Enter the second string");
        String secondString = input.nextLine();
        CharSequence seq = "abc";
        System.out.println("Comparing " + firstString + " and " + seq + ": " + firstString.contentEquals(seq));
        System.out.println("Comparing " + secondString + " and " + seq +": " + secondString.contentEquals(seq));
    }
}