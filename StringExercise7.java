import java.util.Scanner;

public class StringExercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string");
        String firstString = input.nextLine();
        System.out.println("Enter the second string");
        String secondString = input.nextLine();
        String result = firstString.concat(secondString);
        System.out.println(result);
    }
}