import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        OptionalDouble average = numbers.stream()
                .filter(number -> number % 2 == 1)
                .mapToDouble(number -> number)
                .average();
        if (average.isPresent()) {
            System.out.println(average);
        } else {
            System.out.println("NaN");
        }
    }
}
