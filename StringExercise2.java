public class StringExercise2 {
    public static void main(String[] args) {
        //unicode code point - unique point assigned to each unicode character
        String s = "exercise";
        // getting code point with index 1
        int cp1 = s.codePointAt(1);
        // getting code point with index 4
        int cp2 = s.codePointAt(4);
        System.out.println("Original string is " + s + "\nCharacter (unicode point) = " + cp1 +
                "\nCharacter (unicode point) = " + cp2);
    }
}