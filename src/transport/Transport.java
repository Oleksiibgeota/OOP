package transport;

public abstract class Transport {
    String name;
    String oil;
    int countOil;
    String viewGoing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public double getCountOil() {
        return countOil;
    }

    public void setCountOil(int countOil) {
        this.countOil = countOil;
    }

    public String getViewGoing() {
        return viewGoing;
    }

    public void setViewGoing(String viewGoing) {
        this.viewGoing = viewGoing;
    }
}
