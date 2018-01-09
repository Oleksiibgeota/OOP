package point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random cool = new Random();

        List<Point> points = new ArrayList<>();

        points.add(new Point(10, 10, 10));
        points.add(new Point(10, 10, 10));
        points.add(new Point(10, 10, 10));
        points.add(new Point(10, 10, 10));


//        Point p1 = new Point(10,10,10);
//        Point p2 = new Point(10,10,10);
//        Point p3 = new Point(10,10,10);
////            симметричность
//        System.out.println(p1.equals(p2));          методы проверки
//        System.out.println(p2.equals(p1));
////            рефлексивность
//        System.out.println(p1.equals(p1));
////            транзитивность
//        System.out.println(p1.equals(p2) && p2.equals(p3) && p1.equals(p3));

       for (int i = 0; i < 10000; i++) {
           points.add(new Point(cool.nextInt(100), cool.nextInt(100), cool.nextInt(100)));
        }
        System.out.println(points);

        int identical = 0;
        for (int i = 0; i < points.size(); i++) {
            Point p = points.get(i);

            for (int j = i; j < points.size(); j++) {
//                System.out.println(p+ " :: "+points.get(j)+"="+ p.equals(points.get(j)));
                if (i != j && p.equals(points.get(j))) {
                    identical++;
                }
            }
        }
        System.out.println(identical);

        // система просматривает количество совпадений , но не совпадающих точек


    }
}
