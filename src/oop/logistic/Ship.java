package oop.logistic;

public class Ship extends Transport {

    @Override
    public double getCost() {
        return getFuel()*10.5;
    }
}
