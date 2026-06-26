package exercise5;

public class Square {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Square(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
	public boolean isSquare() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
		double dDA = D.distance(A);
		double dBD = B.distance(D);
		double dAC = A.distance(C);
		if(dAB == dBC && dBC == dCD && dCD == dDA && dBD == dAC) {
			return true;
		}
		else {
			return false;
		}
	}
}
