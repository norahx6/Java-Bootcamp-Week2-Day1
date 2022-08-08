package Day1;

public class Circle2 implements GeomtricObject{

    protected double radius;

    public Circle2 (double radius) {

        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius;
    }

    @Override
    public double getPerimeter() {
        return getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + '\'' +
                '}';
    }
}//end
