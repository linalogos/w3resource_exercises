import java.util.Scanner;

public class StringExercise22 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int length = str.length();
        System.out.println("Length of '" + str + "' is " + length);
    }
}