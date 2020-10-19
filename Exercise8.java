import java.util.*;
public class Exercise8 {
    public static void main(String[] args) {
    Calendar ght = Calendar.getInstance();
    ght.set(Calendar.DAY_OF_MONTH, ght.getActualMaximum(Calendar.DAY_OF_MONTH));
    System.out.println("Last date of current month: " + ght.getTime());
    }
}