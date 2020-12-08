public class Queen extends HoneyBee implements Stinger{

    /*
     Queen is a HoneyBee
     Queen is capable of stinging (from stinger interface)
    */

    public void layEggs() {
        System.out.println("Laying eggs...");
    }

    @Override
    public void work() {
        layEggs();
    }

    @Override
    public void sting() {
        System.out.println("STING!!!");
    }
}
