public class StringExercise25 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String str1 = "cat";
        String str2 = str.replace("fox", str1);
        System.out.println(str2);
    }
}