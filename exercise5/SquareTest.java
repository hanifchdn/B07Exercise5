package exercise5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testPerimeterReg() {
		Point a = new Point(1, 1);
		Point b = new Point(1, 2);
		Point c = new Point(2, 2);
		Point d = new Point(2, 1);
		Square s = new Square(a, b, c, d);
		
		assertEquals(4.0, s.perimeter());
	}
	
	@Test
	void testPerimeterRotated() {
		Point a = new Point(0, 0);
		Point b = new Point(-3, 4);
		Point c = new Point(1, 7);
		Point d = new Point(4, 3);
		Square s = new Square(a, b, c, d);
		
		assertEquals(20.0, s.perimeter());
	}
	
	@Test
	void testIsSquareTrue() {
		Point a = new Point(1, 1);
		Point b = new Point(1, 2);
		Point c = new Point(2, 2);
		Point d = new Point(2, 1);
		Square s = new Square(a, b, c, d);
		
		assertTrue(s.isSquare());
	}
	
	@Test
	void testIsSquareFalse() {
		Point a = new Point(0.5, -10);
		Point b = new Point(-1, 2);
		Point c = new Point(1, 3);
		Point d = new Point(2, 1);
		Square s = new Square(a, b, c, d);
		
		assertFalse(s.isSquare());
	}
}
