package transport;

public class Plane extends Transport{
    @Override
    public String getViewGoing() {
        return super.getViewGoing() + "airplane";
    }
}
