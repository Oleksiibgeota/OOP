package book.classes_and_objects.glava2;

public class DirectClass {
    public double calculateDistance(
            Point r1, Point r2) {
        /* вычисление расстояния */
        double dx = r1.getX() - r2.getX();
        double dy = r1.getY() - r2.getY();
        return Math.hypot(dx, dy);
    }
}
