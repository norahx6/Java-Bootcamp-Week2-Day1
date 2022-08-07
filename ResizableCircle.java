package Day1;

public class ResizableCircle extends Circle2{

    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }

    public double resize(int precent){
        return radius = precent / 100.0 ;
    }
}
