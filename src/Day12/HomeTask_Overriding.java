package Day12;

public class HomeTask_Overriding {
    public static void main(String[] args) {

        vehicle v1 = new car();

        v1.start();
    }
}
class vehicle {

    void start() {
        System.out.println("vehicle Started");
    }
}

class car extends vehicle {

    void start() {
        System.out.println(" Car Started");
    }
}
