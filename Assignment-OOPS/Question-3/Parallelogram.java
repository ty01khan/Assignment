// Parallelogram: it is a trapezoid having opposite sides are equal and parallel
// Area = width * height

public class Parallelogram extends Trapezoid {
	
	public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	public double getWidth() {
		if(getVertex1().getYCoordinate() == getVertex2().getYCoordinate()) {
			return Math.abs(getVertex1().getXCoordinate() - getVertex2().getXCoordinate());
		}
		else {
			return Math.abs(getVertex1().getXCoordinate() - getVertex4().getXCoordinate());
		}
	}
	
	public String details() {
		return String.format("%nCoordinates of Parallelogram are: %s%nHeight is: %.1f%nWidth is: %.1f%nArea is: %.1f", getCoordinates(), getHeight(), getWidth(), getArea());
	}
}
