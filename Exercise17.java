import java.time.*;

public class Exercise17 {
    public static void main (String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate pastDate = currentDate.minusYears(1);
        LocalDate futureDate = currentDate.plusYears(1);
        System.out.println("Current date: " + currentDate +
                "\nDate one year ago: " + pastDate +
                "\nDate in one year: " + futureDate);
    }
}