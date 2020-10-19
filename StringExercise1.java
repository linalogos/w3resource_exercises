public class StringExercise1 {
    public static void main(String[] args) {
        String s = "I'm doing exercises on strings";
        // getting characters located at positions 0 and 5
        char firstCharacter = s.charAt(0);
        char fifthCharacter = s.charAt(5);
        System.out.println("Original string is " + s + "\nCharacter at 0 position is " + firstCharacter
        + "\nCharacter at 5th position is " + fifthCharacter);
    }
}