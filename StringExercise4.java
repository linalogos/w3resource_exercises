public class StringExercise4 {
    public static void main(String[] args) {
        String s = "stringname";
        //counting amount of unicode code points within specified range in string
        int amount = s.codePointCount(1,5);
        System.out.println("Original string: " + s + "\nAmount of code points within defined range: " + amount);
    }
}