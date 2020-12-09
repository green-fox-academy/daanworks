import java.util.ArrayList;

public class Sum {

    public Integer sumNumbers(ArrayList<Integer> numberList) {

            int sum = 0;

            for (Integer number : numberList) {
                sum = sum + number;
            }

            return (Integer) sum;

    }

}
