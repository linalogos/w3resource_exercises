import java.time.*;

public class Exercise28 {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now().minusHours(8).minusMinutes(30);
        System.out.println("\nCurrent Date and Time:  " + LocalDateTime.now());
        System.out.println("Before 7 hours and 30 minutes: " + dateTime+"\n");
    }

}