public class StringExercise23 {
    public static void main(String[] args) {
        String str1 = "one two three four";
        String str2 = "four three two one";
        //checking matching characters 0-2 15-17
        boolean match = str1.regionMatches(0, str2, 15, 3);
        System.out.println("str1(2-0) == str2(17-15)? " + match);
    }
}