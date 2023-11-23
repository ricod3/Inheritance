import java.awt.*;

// Subclass / Childclass
public class Rectangle extends Shapes {
    private double length;
    private double width;

    // constructor matching super
    public Rectangle(double length, double width, String color, boolean isFilled) {
        super(color, isFilled);
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length or width is negative!");
        }
        this.length = length;
        this.width = width;
        this.setColor(color);
        this.setFilled(isFilled);
    }


    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }
}
