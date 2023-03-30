package shape;

public class Cylinder extends Shape {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return Math.PI*Math.pow(getRadius(), 2)*getHeight();
    }

    public double getVolume() {
        return (2*Math.PI*Math.pow(getRadius(), 2))+(2*Math.PI*getRadius()*getHeight());
    }

  
}
  