package geometry;


public class Square {

    private static int count = 0;

    int side; //поле
    protected int side2; //поле
    int side3; //поле
    private int side4; //поле

    //ниже конструктор
    public Square() {
        side = 1;
        count = count + 1;
    }

    public Square(int side) {
        this.side = side;
        count++;
    }

    public static int getCount() {
        return count;
    }

    // это метод (обязательны или пустые или параметрами)
    public double area() {
        return side * side;
    }

    public double perimiter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return super.toString() + " side: " + side;
    }


}
