package Day1;

public class Circle2 {

    protected double radius = 1.0;

    public Circle2 (double radius) {
        this.radius=radius;
    }

    public double getArea() {
        return radius * radius;
    }

    public double getPerimeter() {
        return radius * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + '\'' +
                '}';
    }
}//end
