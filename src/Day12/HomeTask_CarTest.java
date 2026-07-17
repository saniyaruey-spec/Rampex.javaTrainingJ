package Day12;

public class HomeTask_CarTest {
    public static void main(String[] args) {

        SportsCar car = new SportsCar();

        car.start();
        car.turbo();
    }
}
class Vehicle{

    void start() {
        System.out.println("Car Started");
    }
}

class SportsCar extends Vehicle {

    void turbo() {
        System.out.println("Turbo Enabled");
    }
}
