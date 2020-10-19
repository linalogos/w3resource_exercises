import java.time.*;

public class Exercise11 {
    public static void main (String[] args) {
    YearMonth ym = YearMonth.now();
    int amountOfDays = ym.lengthOfMonth();
    System.out.println(amountOfDays);
    }
        }
