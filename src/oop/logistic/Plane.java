package oop.logistic;

public class Plane extends Transport {
    @Override
    public double getCost() {
        return getDistance()*getFuel()*2.5;
    }
}
