package oop.logistic;

public class Main {
    public static void main(String[] args) {
        Transport transport1 = new Plane();
        Transport transport2 = new Ship();
        Transport transport3 = new Fura();
        Transport transport4 = new CityTrack();
        Fura fura1 = (Fura) transport3;
    }
}
