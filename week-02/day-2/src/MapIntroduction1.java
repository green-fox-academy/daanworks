import java.util.HashMap;
import java.util.Map;

public class MapIntroduction1 {
    public static void main(String[] args) {
//        Create an empty map where the keys are integers and the values are characters
//        Print out whether the map is empty or not
//        Add the following key-value pairs to the map:
//        Key	Value
//        97	    a
//        98	    b
//        99	    c
//        65	    A
//        66	    B
//        67	    C
//        Print all the keys
//        Print all the values
//        Add value D with the key 68
//        Print how many key-value pairs are in the map
//        Print the value that is associated with key 99
//        Remove the key-value pair where with key 97
//        Print whether there is an associated value with key 100 or not
//        Remove all the key-value pairs

        Map<Integer, String> myMap = new HashMap<>();

        if(myMap.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty");
        }

        myMap.put(97, "a");
        myMap.put(98, "b");
        myMap.put(99, "c");
        myMap.put(65, "A");
        myMap.put(66, "B");
        myMap.put(67, "C");

        for (Integer key : myMap.keySet()) {
            System.out.println(key);
        }

        for (String value : myMap.values()) {
            System.out.println(value);
        }

        myMap.put(68, "D");

        System.out.println(myMap.size());

        System.out.println(myMap.get(99));

        myMap.remove(97);
        System.out.println(myMap.get(97));

        if(myMap.get(100) == null) {
            System.out.println("Key 100 doesn't exists.");
        } else {
            System.out.println("Key 100 exists.");
        }

        myMap.clear();

    }
}
