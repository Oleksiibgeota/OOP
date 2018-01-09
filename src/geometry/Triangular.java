package geometry;

public class Triangular extends Square {

    public Triangular(int side) {
        super(side);
    }

    public double area() {
        return (Math.sqrt(3) * Math.pow(side, 2)) / 4;
    }

    public double perimiter() {
        return side * 3;
    }

    protected int test1(){
        return 900;
    }

    int test2(){
        return 900;
    }

    private int test3(){
        return 900;
    }
}
