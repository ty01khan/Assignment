/**
 * 
 * @author Talha Yaseen
 *
 *
 * Point: this class defines a point (vertex of quadrilateral)
 */
public class Point {
	
	/**
	 * x and y coordinates of a point
	 */
	private double x;
	private double y;
	
	/**
	 *  Point constructor
	 * @param x : x coordinate of the point
	 * @param y : y coordinate of the point
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * @return x coordinate of the point
	 */
	public double getXCoordinate() {
		return x;
	}
	
	/**
	 * 
	 * @return x coordinate of the point
	 */
	public double getYCoordinate() {
		return y;
	}
	
	/**
	 * 
	 * @return coordinates of the point
	 */
	public String getPoint() {
		return String.format("(%.1f, %.1f)", x, y);
	}
}
