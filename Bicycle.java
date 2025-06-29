public class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    @Override
    public void start() {
        System.out.println("Pedal away! The bicycle is moving.");
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring Ring!");
        } else {
            System.out.println("No bell on this bicycle.");
        }
    }

    // Optional: Getters/Setters
    public boolean getHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}