import java.time.*;

public class Exercise18 {
    public static void main(String[] args) {
        Year year = Year.now();
        if (year.isLeap()) {
            System.out.println("This year is leap");
        } else {
            System.out.println("This year isn't leap");
        }
    }
}