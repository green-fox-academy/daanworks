import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    Sum sum;


    @Before
    public void setup() {
        sum = new Sum();
    }

    @Test
    public void happy_ending_with_multiple_elements() {
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            numList.add(i);
        }

        Integer expected = 6;
        Integer actual = sum.sumNumbers(numList);
        assertEquals(expected, actual);
    }

    @Test
    public void empty_list() {
        ArrayList<Integer> numList = new ArrayList<>();

        Integer expected = 0;
        Integer actual = sum.sumNumbers(numList);
        assertEquals(expected, actual);
    }

    @Test
    public void list_with_one_element() {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);

        Integer expected = 1;
        Integer actual = sum.sumNumbers(numList);
        assertEquals(expected, actual);
    }

    @Test(expected=NullPointerException.class)
    public void null_input() {
        ArrayList<Integer> numList = null;
        sum.sumNumbers(numList);
    }



}