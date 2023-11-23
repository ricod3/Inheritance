// Subcalss / Childclass
public class Circle extends Shapes{
    private double radius;

    public Circle(String color, boolean isFilled) {
        super(color, isFilled);
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }
}
