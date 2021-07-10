// more than one child classes have the same parent class
// then this inheritance is hierarchical inheritance

public class Quadrilateral {
	private Point v1;
	private Point v2;
	private Point v3;
	private Point v4;
	
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		this.v1 = new Point(x1, y1);
		this.v2 = new Point(x2, y2);
		this.v3 = new Point(x3, y3);
		this.v4 = new Point(x4, y4);
	}
	
	public Point getVertex1() {
		return v1;
	}
	
	public Point getVertex2() {
		return v2;
	}
	
	public Point getVertex3() {
		return v3;
	}
	
	public Point getVertex4() {
		return v4;
	}
	
	public String getCoordinates() {
		return String.format("%s, %s, %s, %s", v1.getPoint(), v2.getPoint(), v3.getPoint(), v4.getPoint());
	}
	
	public String details() {
		return String.format("Coordinates of Quadrilateral are: %s%n", getCoordinates());
	}
}
