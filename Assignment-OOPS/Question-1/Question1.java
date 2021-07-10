// Overriding: if subclass (child class) has the same method as declared in the parent class
// Overloading: if a class has multiple methods having same name but different in parameters

// parent class
public class Question1 {
	public void add(int a, int b) {
		System.out.println((a+b) + " parent method 1");
	}
	
	public void add(int a, int b, int c) {
		System.out.println((a+b+c) + " parent method 2");;
	}
}

// sub class
class Question1Child extends Question1 {
	
	@Override
	public void add (int a, int b) {
		System.out.println((a+b) + " child method");;
	}
}
