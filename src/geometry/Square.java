package geometry;


public class Square {
    int side; //поле

    //ниже конструктор
    public Square(){
        side = 1;
    }

    public Square(int side){
        this.side = side;
    }

// это метод (обязательны или пустые или параметрами)
    public double area(){
        return side*side;
    }

    public double perimiter(){
        return side*4;
    }

    @Override
    public String toString() {
        return "side: "+side;
    }
}
