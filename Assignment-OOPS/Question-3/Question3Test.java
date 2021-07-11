/**
 * 
 * @author Talha Yaseen
 *
 */
public class Question3Test {

	public static void main(String[] args) {
		Quadrilateral q = new Quadrilateral(-1.1, 2, 5, -1, 3, 7.4, 1, 5.2);
		
		Trapezoid t = new Trapezoid(0, 0, 10, 0, 8, 5.7, 4, 5.7);
		
		Parallelogram p = new Parallelogram(0, 0, 2, 5, 8, 5, 6, 0);
		
		Rectangle r = new Rectangle(-1, -2.2, -1, 7.3, 8, 7.3, 8, -2.2);
		
		Square s = new Square(4, 0, 16, 0, 16, 12, 4, 12);
		
		System.out.printf("%s %s%n %s%n %s%n %s%n", q.getDetails(), t.getDetails(), p.getDetails(), r.getDetails(), s.getDetails());
	}

}
