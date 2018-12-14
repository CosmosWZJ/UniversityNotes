package Shape;

public class Sphere extends Circle {
    public double getArea() {
        return super.getArea() * 4;
    }
}
