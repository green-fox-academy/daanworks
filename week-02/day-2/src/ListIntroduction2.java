import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
//        Create a list ('List A') which contains the following values
//                Apple, Avocado, Blueberries, Durian, Lychee
//        Create a new list ('List B') with the values of List A
//        Print out whether List A contains Durian or not
//        Remove Durian from List B
//        Add Kiwifruit to List A after the 4th element
//        Compare the size of List A and List B
//        Get the index of Avocado from List A
//        Get the index of Durian from List B
//        Add Passion Fruit and Pomelo to List B in a single statement
//        Print out the 3rd element from List A

        List<String> listA = new ArrayList<>();

        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        List<String> listB = new ArrayList<>(listA);

        if(listA.contains("Durian")) {
            System.out.println("List A contains Durian.");
        }

        listB.remove("Durian");

        listA.add(4, "Kiwifruit");

        if(listA.size() == listB.size()) {
            System.out.println("The two lists are in the same size.");
        } else if(listA.size() > listB.size()) {
            System.out.println("List A is bigger.");
        } else {
            System.out.println("List B is bigger");
        }

        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));

        List<String> listC = new ArrayList<>();
        listA.add("Passion Fruit");
        listA.add("Pomelo");
        listB.addAll(listC);

        System.out.println(listA.get(2));

    }
}
