import java.util.Arrays;

public class Anagram {

    public boolean areEqual(String string1, String string2) {
        string1.toLowerCase();
        string2.toLowerCase();
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        String sorted1 = new String(charArray1);
        String sorted2 = new String(charArray2);
        return sorted1.equals(sorted2);
    }

}
