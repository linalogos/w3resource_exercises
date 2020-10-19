import java.util.Scanner;

public class StringExercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.nextLine();
        char ch = 'a';
        String str1 = str.replace(ch, '*');
        System.out.println(str1);
    }
}