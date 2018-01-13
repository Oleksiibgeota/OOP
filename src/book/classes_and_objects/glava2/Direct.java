package book.classes_and_objects.glava2;

public class Direct {
    public static void main(String[] args) {
        Point t1 = new Point(5, 10);
        Point t2 = new Point(2, 6);
        System.out.print("расстояние равно : "
                + new DirectClass().calculateDistance(t1, t2));
        Point p1 = new Point(10,12);
        Point p2 = new Point(7, 8);
//        double distance = new DirectClass().calculateDistance(p1,p2);

        DirectClass distance;
        if (true){
            distance = new DirectClass();
        }
        double a = distance.calculateDistance(p1,p2);

        System.out.println("");
        System.out.println(distance);


    }
}
