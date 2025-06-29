public class Main {
    public static void main(String[] args) {
        // Create and test Car object
        Car myCar = new Car(60, 10.5, 4);
        myCar.start();
        myCar.displayFuel();
        myCar.honk();

        System.out.println(); // spacer

        // Create and test Bicycle object
        Bicycle myBike = new Bicycle(15, 0.0, true);
        myBike.start();
        myBike.displayFuel();
        myBike.ringBell();
    }
}