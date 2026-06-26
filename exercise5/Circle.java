package exercise5;

public class Circle {
	Point p;
	double r;
	
	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}
	
	public double perimeter() {
		return 2 * Math.PI * r; 
	}
	
	public double area() {
		return Math.PI * r * r;
	}
}