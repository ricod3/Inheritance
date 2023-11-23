import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5, "blue", false);
        Shapes rectangle = new Rectangle(10, 5, "green", true);
        Shapes square = new Square(10, "yellow", true);

        List<Shapes> shapesList = new ArrayList<>(List.of(circle, rectangle, square));

        for (Shapes s : shapesList) {
            s.output();
        }
    }
}
