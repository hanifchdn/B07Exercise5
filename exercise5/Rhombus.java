package exercise5;

public class Rhombus {
	double diagonal1, diagonal2;
	Point center;

	public Rhombus(double diagonal1, double diagonal2, Point center) {
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		this.center = center;
	}

	public double perimeter() {
		return 4 * Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2));
	}

	public double area() {
		return diagonal1 * diagonal2 / 2;
	}

	public boolean isSquare() {
		return diagonal1 == diagonal2;
	}
}