import java.sql.SQLOutput;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int sumSecond = 24 * 60 * 60;
        int allRemSeconds = sumSecond - (currentHours * 60 * 60) - (currentMinutes * 60) - currentSeconds;

        System.out.println(allRemSeconds);
    }
}
