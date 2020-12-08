public class Worker extends HoneyBee implements Stinger{

    public void gatherPollen() {
        System.out.println("Gathering pollen....");
    }

    @Override
    public void work() {
        gatherPollen();
    }

    @Override
    public void sting() {
        System.out.println("STING!!!");
    }
}
