import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Exercise9 {
    public static void main(String[] args) {
        // set calendar to current date and time
        LocalDate d = LocalDate.of(2020, Month.OCTOBER, 11);
        System.out.println(d);
        // setting locale to european one & getting first day of the week
        TemporalField fieldISO = WeekFields.of(Locale.GERMANY).dayOfWeek();
        System.out.println(d.with(fieldISO, 1));
        // getting last day of the week
        System.out.println(d.with(fieldISO, 7));








        // set calendar to monday of the current week - locale independent way
        //System.out.println(d.with(DayOfWeek.MONDAY)); - easier way?


    }
}