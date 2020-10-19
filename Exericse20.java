import java.time.*;

public class Exericse20 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 8, 10);
        Period difference = Period.between(date1, date2);
        System.out.println("Difference between " + date1 + " and " + date2 +
                 " is " + difference.getYears() + " years and " + difference.getMonths() + " months.");
    }
}