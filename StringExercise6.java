import java.util.Scanner;

public class StringExercise6 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner (System.in);
        System.out.println("Enter the first string");
        String firstString = inputString.nextLine();
        System.out.println("Enter the second string");
        String secondString = inputString.nextLine();
        int result = firstString.compareToIgnoreCase(secondString);
        if (result < 0) {
            System.out.println("String " + firstString + " is shorter than " + secondString);
        } else if (result == 0 ) {
            System.out.println("String " + firstString + " is equal to " + secondString);
        } else {
            System.out.println("String " + firstString + " is longer than " + secondString);
        }


    }
}