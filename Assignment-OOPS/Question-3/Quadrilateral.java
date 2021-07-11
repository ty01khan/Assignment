/**
 * 
 * @author Talha Yaseen
 *
 *
 * more than one child classes have the same parent class 
 *   then this inheritance is hierarchical inheritance
 */
public class Quadrilateral {
	
	/**
	 * 4 vertices of the Quadrilateral
	 */
	private Point v1;
	private Point v2;
	private Point v3;
	private Point v4;
	
	/**
	 *  Quadrilateral constructor
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @param x4
	 * @param y4
	 */
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		v1 = new Point(x1, y1);
		v2 = new Point(x2, y2);
		v3 = new Point(x3, y3);
		v4 = new Point(x4, y4);
	}
	
	/**
	 * 
	 * @return first vertex
	 */
	public Point getVertex1() {
		return v1;
	}
	
	/**
	 * 
	 * @return second vertex
	 */
	public Point getVertex2() {
		return v2;
	}
	
	/**
	 * 
	 * @return third vertex
	 */
	public Point getVertex3() {
		return v3;
	}
	
	/**
	 * 
	 * @return fourth vertex
	 */
	public Point getVertex4() {
		return v4;
	}
	
	/**
	 * 
	 * @return all 4 coordinates of the Quadrilateral
	 */
	public String getCoordinates() {
		return String.format("%s, %s, %s, %s", v1.getPoint(), v2.getPoint(), v3.getPoint(), v4.getPoint());
	}
	
	public String getDetails() {
		return String.format("Coordinates of Quadrilateral are: %s%n", getCoordinates());
	}
}
