import java.time.*;

public class Exercise15 {
    public static void main (String[] args) {
        LocalTime t = LocalTime.now();
        // adding 2 hours
        LocalTime t1 = t.plusHours(2);
        System.out.println(t1);
    }
}