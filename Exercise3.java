import java.util.*;
public class Exercise3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current date and time:" + c.getTime());
        int actualMaximumYear = c.getActualMaximum(Calendar.YEAR);
        int actualMaximumMonth = c.getActualMaximum(Calendar.MONTH);
        int actualMaximumWeek = c.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int actualMaximumDate = c.getActualMaximum(Calendar.DATE);

        System.out.println("Actual maximum year: " + actualMaximumYear
        + "\nActual maximum month: " + actualMaximumMonth
                + "\nActual maximum week: " + actualMaximumWeek
        + "\nActual maximum date: " + actualMaximumDate);


    }
}