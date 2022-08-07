
package Day1;

public class Cylinder extends Circle {

    private double height = 1.0;

    public Cylinder(double radius ){

        super(radius);
    }

    public Cylinder(double radius, double height ){

        super(radius);
        this.height=height;
    }

    public Cylinder(double radius, double height, String color){

        super(radius,color);
        this.height=height;
    }

    public double getheight (){

        return height;
    }

    public void setHeight(double height){


    }

    public double getvolume (){

        return height * getRadius();
    }
    public static void main(String[] args) {

    }

}// end
