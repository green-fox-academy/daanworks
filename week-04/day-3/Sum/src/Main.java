import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Sum sumMain = new Sum();
        ArrayList<Integer> mainList = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            mainList.add((Integer) i);
        }

        System.out.println(sumMain.sumNumbers(mainList));


    }

}
