// Subclass / Childclass of Rectangle
public class Square extends Rectangle{

    // constructor matching super
    public Square(double length, String color, boolean isFilled) {
        super(length, length, color, isFilled);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
