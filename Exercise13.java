import java.time.*;

public class Exercise13 {
    public static void main(String[] args) {
    // creating a default calendar
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        var dayOfWeek = dt.getDayOfWeek();
        int numberOfDay = 0;
        switch (dayOfWeek) {
            case MONDAY:
                numberOfDay = 1;
                break;
            case TUESDAY:
                numberOfDay = 2;
                break;
            case WEDNESDAY:
                numberOfDay = 3;
                break;
            case THURSDAY:
                numberOfDay = 4;
                break;
            case FRIDAY:
                numberOfDay = 5;
                break;
            case SATURDAY:
                numberOfDay = 6;
                break;
            case SUNDAY:
                numberOfDay = 7;
                break;

        }
        System.out.println("Current day of week: " + numberOfDay);


        }

    }
