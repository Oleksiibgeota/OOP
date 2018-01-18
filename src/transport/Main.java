package transport;

public class Main {
    public static void main(String[] args) {
        Transport Ship1 = new Ship();
        Transport Plane1 = new Plane();

        System.out.println(Plane1.getViewGoing());
        System.out.println(Ship1.countOil);
        System.out.println(Ship1.viewGoing);
    }
}
