import java.time.*;


public class StringExercise15 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        // using String format - here I picked ISO 8601 formatted date and time formatted as 24 hours
        System.out.printf("%tF, %tR", dt, dt);
    }
}