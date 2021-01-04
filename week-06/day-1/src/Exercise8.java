import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('D', 'O', 'N', 'A', 'T', '.');
        String charsAsString = chars.stream()
                .map(character -> character.toString())
                .collect(Collectors.joining());
        System.out.println(charsAsString);
    }
}