package transport;

public class Ship extends Transport {
    @Override
    public double getCountOil() {
        return super.getCountOil() *1.1;
    }
}
