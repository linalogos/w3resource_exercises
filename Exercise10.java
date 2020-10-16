import java.time.*;
public class Exercise10 {
    public static void main(String[] args) {
        YearMonth ym = YearMonth.of(2020, Month.OCTOBER);
        String firstDay = ym.atDay(1).getDayOfWeek().name();
        String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
        System.out.println(firstDay);
        System.out.println(lastDay);
    }
}