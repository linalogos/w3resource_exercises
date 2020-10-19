import java.util.*;

public class StringExercise40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = input.nextLine();
        System.out.println("Enter the number of parts to divide string to");
        int number = input.nextInt();
        splitString(str1, number);
    }
    public static void splitString (String str1, int n) {
        int str_length = str1.length();
        int part_length = str_length/n;
        if (str_length/n != 0) {
            System.out.println("Length of the given string is not divisible by " + n);
        } else {
            System.out.println("Given string was divided into " + n +
                    " parts of length " + part_length);
        }
        for (int i = 0; i < str_length; i++) {
            if (i % part_length  == 0) {
                System.out.println(str1.charAt(i));
            }
        }

    }
}