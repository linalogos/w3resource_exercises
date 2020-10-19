import java.util.Scanner;

public class StringExercise5 {
    public static void main(String[] args) {
        // I used Scanner to ask for user input of 2 strings
        Scanner inputString = new Scanner(System.in);
        System.out.println("Enter first string");
        String firstString = inputString.nextLine();
        System.out.println("Enter second string");
        String secondString = inputString.nextLine();
        // comparing two given strings (CASE SENSITIVE)
        int result = firstString.compareTo(secondString);
        if (result < 0) {
            System.out.println("String " + firstString + " is shorter than " + secondString);
        } else if (result == 0) {
            System.out.println("String " + firstString + " is equal to " + secondString);
        } else {
            System.out.println("String " + firstString + " is longer than " + secondString);
        }


    }

}