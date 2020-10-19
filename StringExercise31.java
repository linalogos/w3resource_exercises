import java.util.Scanner;

public class StringExercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = input.nextLine();
        String str2 = str1.trim();
        System.out.println(str2);
    }
}