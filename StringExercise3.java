import java.util.Scanner;

public class StringExercise3 {
    public static void main(String[] args) {
        String s = "I like Java";
        // getting a unicode code point before the specified character
        // code point before index 1
        int cp1 = s.codePointBefore(1);
        //code point before index 5
        int cp2 = s.codePointBefore(5);
        System.out.println("Default string is " + s + "\nCode point (before index): " + cp1 +
                "\nCode point (before index): " + cp2);


    }
}