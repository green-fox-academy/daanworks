package encapsulationandconstructor;

public class Animal {

    public int hunger = 50;
    public int thirst = 50;

    public Animal() {}

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }

    public void play() {
        hunger++;
        thirst++;
    }

    public static void main(String[] args) {

        Animal tiger = new Animal();
        System.out.println(tiger.hunger);
        tiger.play();
        System.out.println(tiger.hunger);
        tiger.drink();
        System.out.println(tiger.thirst);

        Farm farm = new Farm();

        farm.breed();

        System.out.println(farm.animalList.get(0).hunger);

    }


}
