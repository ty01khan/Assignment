// this class defines a point (vertex of quadrilateral)

public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getXCoordinate() {
		return x;
	}
	
	public double getYCoordinate() {
		return y;
	}
	
	public String getPoint() {
		return String.format("(%.1f, %.1f)", x, y);
	}
}
