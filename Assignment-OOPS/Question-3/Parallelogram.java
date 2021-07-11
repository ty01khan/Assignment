/**
 * 
 * @author Talha Yaseen
 *
 *
 * Parallelogram: it is a trapezoid having opposite sides are equal and parallel
 * Area = width * height
 */
public class Parallelogram extends Trapezoid {
	
	/**
	 *  Parallelogram constructor
	 *  super(): it is used to call the parent class's constructors
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @param x4
	 * @param y4
	 */
	public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	/**
	 * 
	 * @return width of the parallelogram
	 */
	public double getWidth() {
		if(getVertex1().getYCoordinate() == getVertex2().getYCoordinate()) {
			return Math.abs(getVertex1().getXCoordinate() - getVertex2().getXCoordinate());
		}
		else {
			return Math.abs(getVertex1().getXCoordinate() - getVertex4().getXCoordinate());
		}
	}
	
	@Override
	public String getDetails() {
		return String.format("%nCoordinates of Parallelogram are: %s%nHeight is: %.1f%nWidth is: %.1f%nArea is: %.1f", getCoordinates(), getHeight(), getWidth(), getArea());
	}
}
