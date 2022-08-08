package Day1;

public class ResizableCircle extends Circle2 implements Resizable{

    public ResizableCircle(double radius){

        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + super.getRadius() +
                '}';
    }

    @Override
    public void resize(int precent){

        double radiusresize = super.getRadius() * precent / 100.0;
        System.out.println("resize = " + radiusresize);
    }
}
