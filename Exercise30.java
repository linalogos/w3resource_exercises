import java.time.*;
import java.util.*;

public class Exercise30 {
    public static void main(String[] args)
    {
        LocalDate pdate = LocalDate.of(2020, 10, 23);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(pdate, now);

        System.out.printf("\n Difference is %d years, %d months and %d days old\n",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }
}
