// Trapezoid: it is a Quadilateral having two parallel side
// Area = 0.5 * (sum of parallel sides) * (Height)

public class Trapezoid extends Quadrilateral {
	// super(): it is used to call the parent class's constructors
	public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	// height = difference between y coordinates of parallel side vertex
	public double getHeight() {
		if(getVertex1().getYCoordinate() == getVertex2().getYCoordinate()) {
			return Math.abs(getVertex1().getYCoordinate() - getVertex3().getYCoordinate());
		}
		else {
			return Math.abs(getVertex1().getYCoordinate() - getVertex2().getYCoordinate());
		}
	}
	
	public double getSumOfParallelSides() {
		if(getVertex1().getYCoordinate() == getVertex2().getYCoordinate()) {
			return Math.abs(getVertex1().getXCoordinate() - getVertex2().getXCoordinate()) + Math.abs(getVertex3().getXCoordinate() - getVertex4().getXCoordinate());
		}
		else {
			return Math.abs(getVertex1().getXCoordinate() - getVertex4().getXCoordinate()) + Math.abs(getVertex3().getXCoordinate() - getVertex2().getXCoordinate());
		}
	}
	
	public double getArea() {
		return 0.5 * getSumOfParallelSides() * getHeight();
	}
	
	public String details() {
		return String.format("%nCoordinates of Trapezoid are: %s%nHeight is: %.1f%nSum of parallel sides is: %.1f%nArea is: %.1f", getCoordinates(), getHeight(), getSumOfParallelSides(), getArea());
	}
}
