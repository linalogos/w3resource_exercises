public class StringExercise11 {
    public static void main(String[] args) {
        // creating an array of characters
        char[] arr = new char[] {'a', 'b', 'c', 'd'};
        String result = String.copyValueOf(arr, 0, 3);
        System.out.println(result);
    }
}