public class StringExercise35 {
    public static void main(String[] args) {
        String str4 = "abb";
        displayPermutations(str4, "");
    }

    public static void displayPermutations(String str1, String str2) {
        if (str1.length() == 0) {
            System.out.println(str2 + " ");
        }

        for (int i = 0; i < str1.length(); i++ ) {
            // getting ith character of str1
            char c = str1.charAt(i);
            //excluding that ith character from the string
            String str3 = str1.substring(0, i) + str1.substring(i + 1);
            displayPermutations(str3, str2 + c);
        }
    }
}