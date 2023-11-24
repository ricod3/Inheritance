// Subclass / Childclass of Rectangle
public class Square extends Rectangle {

    // constructor matching super
    public Square(double length, String color, boolean isFilled) {
        super(length, length, color, isFilled);
        if (length <= 0) {
            throw new IllegalArgumentException("Length is negative!");
        }
    }

    // without Override getPerimeter and getArea - already defined in rectangle-
    @Override
    public String getShape() {
        return "Square";
    }
}
