import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {
//        Create an empty list which will contain names (strings)
//        Print out the number of elements in the list
//        Add William to the list
//        Print out whether the list is empty or not
//        Add John to the list
//        Add Amanda to the list
//        Print out the number of elements in the list
//        Print out the 3rd element
//        Iterate through the list and print out each name
//        Iterate through the list and print
//        Remove the 2nd element
//        Iterate through the list in a reversed order and print out each name
//        Remove all elements

        List<String> myList = new ArrayList<>();
        System.out.println(myList.size());
        myList.add("William");

        if(myList.isEmpty() == true) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }

        myList.add("John");
        myList.add("Amanda");

        System.out.println(myList.size());
        System.out.println(myList.get(2));

        for (String listItem : myList) {
            System.out.println(listItem);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(i + 1 + ". " + myList.get(i));
        }

        myList.remove(1);

        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }

        myList.clear();

    }
}