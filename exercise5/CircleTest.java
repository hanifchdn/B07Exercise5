package exercise5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void PerimeterTestWhole() {
		Point p = new Point(1, 1);
		Circle c = new Circle(p, 10);
		assertEquals(c.perimeter(), 2 * Math.PI *10);
	}

	@Test
	void PerimeterTestFloat() {
		Point p = new Point(1, 1);
		Circle c = new Circle(p, 10.1);
		assertEquals(c.perimeter(), 2 * Math.PI * 10.1);
	}
	@Test
	void areaTestFloat() {
		Point p = new Point(1, -1);
		Circle c = new Circle(p, 10.1);
		assertEquals(c.area(), Math.PI * Math.pow(10.1, 2));
	}
	
	@Test
	void areaTestWhole() {
		Point p = new Point(1, -1);
		Circle c = new Circle(p, 5);
		assertEquals(c.area(), Math.PI * Math.pow(5, 2));
	}

}
