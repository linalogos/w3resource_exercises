import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current date and time: " + c.getTime());
        int actualMinimumYear = c.getActualMinimum(Calendar.YEAR);
        int actualMinimumMonth = c.getActualMinimum(Calendar.MONTH);
        int actualMinimumWeek = c.getActualMinimum(Calendar.WEEK_OF_MONTH);
        int actualMinimumDate = c.getActualMinimum(Calendar.DATE);
        System.out.println("Actual minimum year: " + actualMinimumYear
        + "\nActual minimum month: " + actualMinimumMonth +
                    "\nActual minimum week: " + actualMinimumWeek +
                    "\nActual minimum day: " + actualMinimumDate);
    }
}