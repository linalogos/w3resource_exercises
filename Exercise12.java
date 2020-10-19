import java.time.*;
import java.util.*;
import java.text.*;

public class Exercise12 {
    public static void main(String[] args) {

        //localize in French

        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("de"));
        String [] dayNames = symbols.getWeekdays();
        for (String s : dayNames) {
            System.out.println(s + "\n");
        }

    }
}