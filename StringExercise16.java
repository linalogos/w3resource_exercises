import java.util.Scanner;

public class StringExercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = input.nextLine();
        byte [] arr = str1.getBytes();
        String str2 = new String(arr);
        System.out.println(str2);

    }
}