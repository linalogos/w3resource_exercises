import java.util.Scanner;

public class StringExercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.nextLine();
        char[] arr = str.toCharArray();
        System.out.println(arr);
    }
}