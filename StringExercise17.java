import java.util.Scanner;

public class StringExercise17{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.nextLine();
        char [] arr = new char[] {' ', ' ', ' ', ' '};
        System.out.println("Enter the index of the first character of string to copy");
        int srcBegin = input.nextInt();
        System.out.println("Enter the index of the last character of string to copy");
        int srcEnd = input.nextInt();
        System.out.println("Enter the number of the start offset of string");
        int dstBegin = input.nextInt();
        str.getChars(srcBegin,srcEnd, arr, dstBegin);
        System.out.println(arr);
    }
}