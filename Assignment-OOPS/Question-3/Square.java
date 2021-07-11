/**
 * 
 * @author Talha Yaseen
 * 
 * 
 * Square: it is a Rectangle whose all sides are equal
 * Area = side^2
 */
public class Square extends Rectangle {
	
	/**
	 *  Square constructor
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
	public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	@Override
	public String getDetails() {
		return String.format("%nCoordinates of Square are: %s%nArea = %.1f sq. unit", getCoordinates(), getArea());
	}
}
