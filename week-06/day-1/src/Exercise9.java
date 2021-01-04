import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        String inputString = "Find the frequency of the characters";
        List<Character> charList = inputString.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        HashMap<Character, Integer> characterFrequencies = new HashMap<>();
        
    }
}
