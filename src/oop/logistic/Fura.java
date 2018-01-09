package oop.logistic;

public class Fura extends Track {
    @Override
    public double getCost() {
        if (getFuelType().equalsIgnoreCase("gasoline")) {

            return getDistance() * getFuel() * 25.8;
        } else {
            return getDistance() * getFuel() * 100;
        }
    }
}
