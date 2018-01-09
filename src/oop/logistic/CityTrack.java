package oop.logistic;

public class CityTrack extends Track {
    @Override
    public double getCost() {
        if (getFuelType().equalsIgnoreCase("gasoline")) {

            return getDistance() * getFuel() * 12.8;
        } else {
            return getDistance() * getFuel() * 50;
        }
    }
}
