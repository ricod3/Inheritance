// Subclass / Childclass
public class Circle extends Shapes {
    private double radius;

    // constructor matching super
    public Circle(double radius, String color, boolean isFilled) {
        super(color, isFilled);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius is negative!");
        }
        this.radius = radius;
        this.setColor(color);
        this.setFilled(isFilled);
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String getShape() {
        return "Circle";
    }
}
