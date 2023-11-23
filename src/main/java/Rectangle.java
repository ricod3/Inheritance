import java.awt.*;

// Subclass / Childclass
public class Rectangle extends Shapes {
    private double length;
    private double width;

    // constructor matching super
    public Rectangle(double length, double width, String color, boolean isFilled) {
        super(color, isFilled);
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
}
