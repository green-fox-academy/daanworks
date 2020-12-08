import java.util.ArrayList;
import java.util.List;

public class Hive {

    private final List<HoneyBee> honeyBees;

    public Hive() {
        honeyBees = new ArrayList<>();
    }

    public void addBee(HoneyBee honeyBee) {
        honeyBees.add(honeyBee);
    }

    public void doWork() {
        for (HoneyBee honeyBee : honeyBees) {
            honeyBee.work();
        }
    }

    public void attack() {
        for (HoneyBee honeyBee : honeyBees) {
            if(honeyBee instanceof Stinger) {
                ((Stinger)honeyBee).sting(); // at kell castolni, mert kuloben a honeyBee nem fog tudni stingelni
            }
        }
    }
}
