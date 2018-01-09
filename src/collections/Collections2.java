package collections;

import geometry.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Collections2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Object());
        list.add("sdfgsfdg");
        list.add(new Rectangle(3,4));

        System.out.println(list);
        Rectangle rec = (Rectangle) list.get(2);
        System.out.println(rec);
        Rectangle rec2 = (Rectangle) list.get(1);
        System.out.println(rec2);

        List<Rectangle> list2 = new ArrayList<>();
    }
}
