import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram;

    @Before
    public void setup() {
        anagram = new Anagram();
    }

    @Test
    public void is_equal() {
        String string1 = "Hannahlow";
        String string2 = "AnnahhoWl";
        boolean expected = true;
        boolean actual = anagram.areEqual(string1, string2);
        assertEquals(actual, expected);
    }

    @Test
    public void is_not_equal() {
        String string1 = "Hannahlowssss";
        String string2 = "AnnahhoWl";
        boolean expected = false;
        boolean actual = anagram.areEqual(string1, string2);
        assertEquals(actual, expected);
    }

}