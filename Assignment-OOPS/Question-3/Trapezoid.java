/**
 * 
 * @author Talha Yaseen
 * 
 * 
 * Trapezoid: it is a Quadrilateral having two parallel side
 * Area = 0.5 * (sum of parallel sides) * (Height)
 */

public class Trapezoid extends Quadrilateral {
	
	/**
	 *  Trapezoid constructor
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
	public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	/**
	 *  height = difference between y coordinates of parallel sides vertex
	 * @return height of the trapezoid
	 */
	public double getHeight() {
		if(getVertex1().getYCoordinate() == getVertex2().getYCoordinate()) {
			return Math.abs(getVertex1().getYCoordinate() - getVertex3().getYCoordinate());
		}
		else {
			return Math.abs(getVertex1().getYCoordinate() - getVertex2().getYCoordinate());
		}
	}
	
	/**
	 * 
	 * @return sum of parallel sides of the trapezoid
	 */
	public double getSumOfParallelSides() {
		if(getVertex1().getYCoordinate() == getVertex2().getYCoordinate()) {
			return Math.abs(getVertex1().getXCoordinate() - getVertex2().getXCoordinate()) + Math.abs(getVertex3().getXCoordinate() - getVertex4().getXCoordinate());
		}
		else {
			return Math.abs(getVertex1().getXCoordinate() - getVertex4().getXCoordinate()) + Math.abs(getVertex3().getXCoordinate() - getVertex2().getXCoordinate());
		}
	}
	
	/**
	 * 
	 * @return area of the trapezoid
	 */
	public double getArea() {
		return 0.5 * getSumOfParallelSides() * getHeight();
	}

	@Override
	public String getDetails() {
		return String.format("%nCoordinates of Trapezoid are: %s%nHeight is: %.1f%nSum of parallel sides is: %.1f%nArea is: %.1f", getCoordinates(), getHeight(), getSumOfParallelSides(), getArea());
	}
}
