package geometry;

public class Main {

    public static void main(String[] args) {
        Square a = new Square(); //объявление переменной ''a'' типа square и приисваивание ей нового объекта типа Square (тот что после new
        Square b = new Square(32);
        Triangular c = new Triangular(3);
        Rectangle d = new Rectangle(4, 6);

        System.out.println("area a: "+a.area());
        System.out.println("peri a: "+a.perimiter());
        System.out.println("area b: "+b.area());
        System.out.println("peri b: "+b.perimiter());
        System.out.println("area c: "+c.area());
        System.out.println("peri c: "+c.perimiter());
        System.out.println("area d: "+d.area());
        System.out.println("peri d: "+d.perimiter());
        //------------------------------------------------
        //------------------------------------------------
        //------------------------------------------------
        Square f1 = new Triangular(4);
        Square f2 = new Rectangle(5,8);
        Square f3 = new Square(4);
        Square f4 = new Square(4);
        Square f5 = new Rectangle(2,4);

        System.out.println(f1.area()+f2.area()+f3.area()+f4.area()+f5.area());
        System.out.println(f1);
        System.out.println(f2);

    }
}
