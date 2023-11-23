// Superclass / Parentclass
public abstract class Shapes {
    private String color;
    boolean isFilled;

    public Shapes (String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {return color;}

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

    public abstract String getType();

    public void output() {
        System.out.printf(">>> " + getType() + " <<<");
        System.out.printf("\n%5s%.2f", "Area: ", this.getArea());
        System.out.printf("\n%5s%.2f", "Perimeter: ", this.getPerimeter());
        System.out.printf("\n%5s%s", "Color: ", this.getColor());
        System.out.printf("\n%5s%s\n", "Filled: ", this.isFilled());
        System.out.println("================");
    }
}
