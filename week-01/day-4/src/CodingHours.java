public class CodingHours {
    public static void main(String[] args) {
        int semesterInDays = 17 * 5;
        int allCodingHours = semesterInDays * 6;

        System.out.println("An attendee codes " + allCodingHours + " hours in a semester.");

        int weeklyCodingHours = 5 * 6;
        double percentageOfCodingHours = (double)weeklyCodingHours / 52 * 100;

        System.out.println((int)percentageOfCodingHours + "% is the weekly average.");
    }
}
