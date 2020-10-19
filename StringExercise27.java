import java.util.Scanner;

public class StringExercise27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = input.nextLine();
        String str2 = str1.substring(0,5);
        System.out.println("new: " + str2 + "\nold: " + str1);
    }
}