import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private final Circle testCircle = new Circle(10, "purple", false);

    @Test
    void testException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            Circle testCircle = new Circle(0, "purle", true);
        });
        System.out.println(ex);
        assertEquals(ex.getMessage(), "Radius is negative!");

        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () -> {
            Circle testCircle = new Circle(-1, "purle", true);
        });
        System.out.println(exc);
        assertEquals(exc.getMessage(), "Radius is negative!");
    }

    @Test
    void testGetArea() {
        assertEquals(10 * 10 * Math.PI, testCircle.getArea());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(10 * 2 * Math.PI, testCircle.getPerimeter());
    }

    @Test
    void testGetShape() {
        assertEquals("Circle", testCircle.getShape());
    }

}