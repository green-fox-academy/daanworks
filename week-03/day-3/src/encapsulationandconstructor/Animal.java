package encapsulationandconstructor;

public class Animal {

    int hunger = 50;
    int thirst = 50;

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

    }


}
