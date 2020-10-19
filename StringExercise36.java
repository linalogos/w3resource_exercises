public class StringExercise36{

    // Returns true if str3 is an interleaving
    // of str1 and str2, otherwise is returning false
    static boolean isInterleaved (String str1, String str2, String str3)
    {
        int i = 0, j = 0, k = 0;

        // iterating through all characters of str3.
        while (k != str3.length())
        {
            // matching first character of str3 with first characters of str1.
            // If matches then moving to next one in str1
            if (i<str1.length()&&str1.charAt(i) == str3.charAt(k))
                i++;

                //else matching first character of str3 with first character of str2.
                // If matches then moving to next one in str2
            else if (j<str2.length()&&str2.charAt(j) == str3.charAt(k))
                j++;

                // If doesn't match with either str1 or str2, then returning false

            else
                return false;
            // Move C to next for next iteration
            k++;
        }

        // If A or B still have some characters,
        // then length of C is smaller than sum
        // of lengths of A and B, so return false
        if (i < str1.length() || j < str3.length())
            return false;

        return true;
    }

    public static void main(String []args){
        String str1 = "AB";
        String str2 = "CD";
        String str3 = "ACBG";
        if (isInterleaved(str1, str2, str3) == true)
            System.out.printf("%s is interleaved of %s and %s", str3, str1, str2);
        else
            System.out.printf("%s is not interleaved of %s and %s", str3, str1, str2);
    }
}
