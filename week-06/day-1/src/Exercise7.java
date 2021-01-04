import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Exercise7 {

    public static List<String> search(List<String> inputList, String searchTerm) {
        return inputList.stream()
                .filter(element -> element.contains(searchTerm))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
                "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        for(String result : search(cities, "BI")) {
            System.out.println(result);
        }
    }
}
