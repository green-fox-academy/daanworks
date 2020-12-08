public class Drone extends HoneyBee{

    public void mate() {
        System.out.println("I'm mating....");
    }

    @Override
    public void work() {
        mate();
    }
}
