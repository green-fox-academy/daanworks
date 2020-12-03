package encapsulationandconstructor;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> animalList = new ArrayList<>();
    int slots = 1;

    public void breed() {
        if(slots > animalList.size()) {
            animalList.add(new Animal());
        }
    }

    public void slaughter() {

        int animalToDieIndex = 0;
        int leastHungry = Integer.MAX_VALUE;

        for (int i = 0; i < animalList.size(); i++) {
            if(animalList.get(i).hunger < leastHungry){
                leastHungry = animalList.get(i).hunger;
                animalToDieIndex = i;
            }
        }

        animalList.remove(animalToDieIndex);

    }

}
