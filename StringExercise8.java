import java.util.Scanner;

public class StringExercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string");
        String firstString = input.nextLine();
        System.out.println("Enter the second string");
        String secondString = input.nextLine();
        System.out.println(firstString.contains(secondString));

    }
}