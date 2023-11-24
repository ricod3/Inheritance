// Superclass / Parentclass
public abstract class Shapes {
    private String color;
    boolean isFilled;

    public Shapes(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String getShape();

    public String toString() {
        StringBuilder sB = new StringBuilder();
        sB.append(">>> ").append(getShape()).append(" <<<\n");
        sB.append(print());
        sB.append("==================");
        return sB.toString();
    }

    public String print() {
        return String.format("%5s%.2f\n%5s%.2f\n%5s%s\n%5s%s\n", "Area: ", this.getArea(), "Perimeter: ", this.getPerimeter(), "Color: ", this.getColor(), "Fillled: ", this.isFilled());
    }
}
