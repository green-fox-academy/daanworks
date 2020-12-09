import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters countLetters;

    @Before
    public void setup() {
        countLetters = new CountLetters();
    }

    @Test
    public void happy_path() {

        Map<Character, Integer> expected = new HashMap<>();

        expected.put('h', 1);
        expected.put('y', 2);
        expected.put('l', 4);
        expected.put('m', 1);
        expected.put('o', 2);

        Map<Character, Integer> actual = CountLetters.createMap("hollymolly");

        assertEquals(expected, actual);

    }

    @Test(expected=NullPointerException.class)
    public void test_null_input() {
        Map<Character, Integer> actual;
    }

}