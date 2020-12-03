package complexarchitectures;

public class Station {

    public int gasAmount;

    public void refill(Car car) {
        gasAmount = gasAmount - car.capacity;
        car.gasAmount = car.gasAmount + car.capacity;
    }

    public static void main(String[] args) {

        Car car = new Car();
        Station station = new Station();

        station.gasAmount = 500;

        station.refill(car);
        System.out.println(station.gasAmount); // should be 400
        System.out.println(car.gasAmount); // should be 100


    }

}
