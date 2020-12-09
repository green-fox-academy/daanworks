import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountLetters {

    public Map<Character, Integer> createMap(String inputString) {

        Map<Character, Integer> map = new HashMap<>();
        String lowCaseString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            Character c = lowCaseString.charAt(i);
            if (map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }

        return map;

    }

}
