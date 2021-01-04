import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {
        String inputString = "WoooHoHoooOYoo";
        List<Character> charList = inputString.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        List<Character> upperCaseCharList = charList.stream()
                .filter(Character::isUpperCase)
                .collect(Collectors.toList());
        for (Character c : upperCaseCharList) {
            System.out.println(c);
        }
    }
}
