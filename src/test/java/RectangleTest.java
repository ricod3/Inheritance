import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private final Rectangle testRectangle = new Rectangle(10, 5, "purple", false);

    @Test
    void testGetArea() {
        assertEquals(10 * 5, testRectangle.getArea());
    }

    @Test
    void testExceptionWhereWidthIsNull() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            Rectangle testRectangle = new Rectangle(5, 0, "purle", true);
        });
        System.out.println(ex);
        assertEquals(ex.getMessage(), "Length or width is negative!");
    }

    @Test
    void testExceptionWhereLenghtIsNegative() {
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () -> {
            Rectangle testRectangle = new Rectangle(-1, 5, "purle", true);
        });
        System.out.println(exc);
        assertEquals(exc.getMessage(), "Length or width is negative!");
    }

    @Test
    void testGetPerimeter() {
        assertEquals(2 * 10 + 2 * 5, testRectangle.getPerimeter());
    }
    // Testing IllegalArgumentException twice (with 0 and - 1 value)

    @Test
    void testGetShape() {
        assertEquals("Rectangle", testRectangle.getShape());
    }

    @Test
    void testGetLenght() {
        assertEquals(10, testRectangle.getLength());
    }
}