import java.util.*;
public class Exercise5 {
    public static void main(String[] args) {
        // creating a default calendar
        Calendar c = Calendar.getInstance();
        System.out.println("Current date in full format" + c.getTime());
        // displaying information from the default calendar
        System.out.println("Current year: " + c.get(Calendar.YEAR) +
                    "\nCurrent month: " + c.get(Calendar.MONTH) +
                    "\nCurrent week: " + c.get(Calendar.WEEK_OF_YEAR) +
                    "\nCurrent day: " + c.get(Calendar.DATE) +
                    "\nCurrent hour: " + c.get(Calendar.HOUR) +
                    "\nCurrent minute: " + c.get(Calendar.MINUTE));

    }
}