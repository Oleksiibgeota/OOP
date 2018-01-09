package collections;

import geometry.Square;
import geometry.Test;
import geometry.Triangular;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List col1 = new ArrayList();

        col1.add(new Square(4));
        col1.add(new Square(5));
        col1.add(new Square(6));
        col1.add(new Square(6));
        col1.add(new Square(6));
        col1.add(new Square(6));
        System.out.println(col1);

        for (int i = 0; i < col1.size(); i++) {
            System.out.println(col1.get(i));
        }
        System.out.println("---------------------------");
        System.out.println("size: " + col1.size());

        Square test = new Square(4);

        Test fff = Test.getTest();

    }
}
