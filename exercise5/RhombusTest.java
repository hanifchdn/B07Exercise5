package exercise5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RhombusTest {

    @Test
    void testConstructorD1() {
        double d1 = 1;
        double d2 = 2.5;
        Point c = new Point(1, 1);

        Rhombus r = new Rhombus(d1, d2, c);

        assertEquals(d1, r.diagonal1);
    }

    @Test
    void testConstructorD2() {
        double d1 = 1;
        double d2 = 2.5;
        Point c = new Point(1, 1);

        Rhombus r = new Rhombus(d1, d2, c);

        assertEquals(d2, r.diagonal2);
    }

    @Test
    void testConstructorC() {
        double d1 = 1;
        double d2 = 2.5;
        Point c = new Point(1, 1);

        Rhombus r = new Rhombus(d1, d2, c);

        assertEquals(c, r.center);
    }

    @Test
    void testPerimeter() {
        double d1 = 3;
        double d2 = 4;
        Point c = new Point(1, 1);

        Rhombus r = new Rhombus(d1, d2, c);

        assertEquals(10.0, r.perimeter());
    }

    @Test
    void testPerimeterZero() {
        double d1 = 0;
        double d2 = 0;
        Point c = new Point(1, 1);

        Rhombus r = new Rhombus(d1, d2, c);

        assertEquals(0.0, r.perimeter());
    }

    @Test
    void testPerimeterEquivalentDiagonalsDifferentPoints() {
        double d1 = 3;
        double d2 = 4;
        Point c1 = new Point(1, 1);

        Rhombus r1 = new Rhombus(d1, d2, c1);

        double d3 = 3;
        double d4 = 4;
        Point c2 = new Point(3, 4);

        Rhombus r2 = new Rhombus(d3, d4, c2);

        assertEquals(r1.perimeter(), r2.perimeter());
    }

    @Test
    void testArea() {
        double d1 = 3;
        double d2 = 4;
        Point c = new Point(1, 1);

        Rhombus r = new Rhombus(d1, d2, c);

        assertEquals(6.0, r.area());
    }

    @Test
    void testAreaZero() {
        double d1 = 0;
        double d2 = 0;
        Point c = new Point(1, 1);

        Rhombus r = new Rhombus(d1, d2, c);

        assertEquals(0.0, r.area());
    }

    @Test
    void testAreaEquivalentDiagonalsDifferentPoints() {
        double d1 = 3;
        double d2 = 4;
        Point c1 = new Point(1, 1);

        Rhombus r1 = new Rhombus(d1, d2, c1);

        double d3 = 3;
        double d4 = 4;
        Point c2 = new Point(3, 4);

        Rhombus r2 = new Rhombus(d3, d4, c2);

        assertEquals(r1.area(), r2.area());
    }

    @Test
    void testSquareTrue() {
        double d1 = 1;
        double d2 = 1;
        Point c = new Point(1, 1);

        Rhombus r = new Rhombus(d1, d2, c);

        assertTrue(r.isSquare());
    }

    @Test
    void testSquareFalse() {
        double d1 = 1;
        double d2 = 2;
        Point c = new Point(1, 1);

        Rhombus r = new Rhombus(d1, d2, c);

        assertFalse(r.isSquare());
    }
}
