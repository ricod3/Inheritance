import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private final Square testSquare = new Square(5, "purple", false);

    @Test
    void testGetArea() {
        assertEquals(5 * 5, testSquare.getArea());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(5 * 4, testSquare.getPerimeter());
    }

    @Test
    void testGetShape() {
        assertEquals("Square", testSquare.getShape());
    }

    @Test
    void testException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            Shapes testSquare = new Square(0, "green", true);
        });
        System.out.println(ex);
        assertEquals(ex.getMessage(), "Length or width is negative!");
    }

}