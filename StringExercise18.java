import java.util.Scanner;

public class StringExercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.nextLine();
        //using hash functions
        int hashCode = str.hashCode();
        System.out.println("Hashcode for " + str + " is " + hashCode);
    }
}