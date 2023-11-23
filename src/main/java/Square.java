// Subclass / Childclass of Rectangle
public class Square extends Rectangle {

    // constructor matching super
    public Square(double length, String color, boolean isFilled) {
        super(length, length, color, isFilled);
        if (length <= 0) {
            throw new IllegalArgumentException("Length is negative!");
        }
    }

    @Override
    public double getArea() {
        return getLength() * getLength();
    }

    @Override
    public double getPerimeter() {
        return getLength() * 4;
    }

    @Override
    public String getShape() {
        return "Square";
    }
}
