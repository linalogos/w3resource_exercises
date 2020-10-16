import java.time.*;

public class Exercise16 {
    public static void main (String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date1 = date.plusWeeks(2);
        System.out.println(date1);
    }
}