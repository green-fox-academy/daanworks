package encapsulationandconstructor;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> sharpieSet = new ArrayList<>();

    public int countUsable() {

        int counter = 0;

        for (Sharpie sharpie : sharpieSet) {
            if(sharpie.inkAmount > 0) {
               counter++;
            }
        }

        return counter;
    }

    public void removeTrash() {
        for (Sharpie sharpie : sharpieSet) {
            if(sharpie.inkAmount <= 0) {
                sharpieSet.remove(sharpie);
            }
        }
    }

}