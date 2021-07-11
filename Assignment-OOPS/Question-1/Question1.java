/**
 * 
 * @author Talha Yaseen
 * 
 * 
 * Overridden: if subclass (child class) has the same method as declared in the parent class
 * Overloading: if a class has multiple methods having same name but different in parameters
 */

// parent class
public class Question1 {
	public void add(int a, int b) {
		System.out.printf("%d + %d = %d : parent method-1 executed%n", a, b, a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.printf("%d + %d + %d = %d : parent method-2 executed%n", a, b, c, a+b+c);
	}
}

// sub class
class Question1Child extends Question1 {
	
	@Override
	public void add (int a, int b) {
		System.out.printf("%d + %d = %d : child method executed%n", a, b, a+b);
	}
}
