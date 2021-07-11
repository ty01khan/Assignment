/**
 * 
 * @author Talha Yaseen
 * 
 * Overridden and Overloading test
 */
public class Question1Test {
	public static void main(String[] args) {
		
		/**
		 *  overridden test
		 */
		Question1Child objChild = new Question1Child();
		objChild.add(2, 3);
		
		
		/**
		 *  overloading test
		 */
		Question1 objParent = new Question1();
		objParent.add(3, 6);
		objParent.add(2, 3, 5);
	}
}

