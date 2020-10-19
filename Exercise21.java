import java.time.*;

public class Exercise21 {
    public static void main(String[] args) {
       LocalDate date1 = LocalDate.now();
       LocalDate date2 = date1.plusDays(10);
       LocalDate date3 = date1.minusDays(10);
       System.out.println("Current date: " + date1 + "\nDate in 10 days: " + date2 + "\nDate 10 days ago: " + date3);
    }
}