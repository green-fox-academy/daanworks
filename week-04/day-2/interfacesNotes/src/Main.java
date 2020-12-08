public class Main {
    public static void main(String[] args) {

        // HoneyBee honeyBee = new HoneyBee(); // letrejon a honeyBee valtozo, tipusa HoneyBee - letrejon egy HoneyBee tipusu obj

        // polymorphism

        // honeyBee = new Queen();
        // honeyBee = new Drone();
        // honeyBee = new Worker();

        // egy valtozo tobb format is fel tudott venni. a valtozo tipusa es az objektum tipusa lehet mas
        // ezt azert tehetem meg, mert a drone es a queen egy honeybee * is-a kapcsolat

        Hive hive = new Hive();
        hive.addBee(new Queen());
        hive.addBee(new Drone());
        hive.addBee(new Worker());

        hive.doWork();

    }
}
