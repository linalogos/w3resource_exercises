import java.util.*;
public class Exercise6 {
    public static void main(String[] args) {
        Calendar cNY = Calendar.getInstance();
        cNY.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in New York: " + cNY.get(Calendar.HOUR_OF_DAY) + ":" + cNY.get(Calendar.MINUTE));
    }
}