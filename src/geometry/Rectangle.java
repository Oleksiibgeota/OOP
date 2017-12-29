package geometry;

public class Rectangle extends Square {
    int anotherSide;

    public Rectangle (int anotherSide, int side){
        this.anotherSide=anotherSide;
        this.side=side;
    }

    @Override
    public double area() {
        return side*anotherSide;
    }

    @Override
    public double perimiter() {
        return (side+anotherSide)*2;
    }
}
