public class StringExercise20 {
    public static void main(String[] args) {
        // canonical representation = process of converting data that has more than one possible representation
        // into standard canonical representation - we need to compare whether different represenatations
        // are equal

        //creating same string in 3 different ways - buffer and interning
        String str1 = "This is a java exercise";
        String str2 =  new StringBuffer("This is ").append("a java exercise").toString();
        String str3 = str2.intern();

        //comparing equality of representations (via '==')
        System.out.println("Is str1 equal to str2? " + (str1 == str2));
        System.out.println("Is str1 equal to str3? " + (str1 == str3));

    }
}