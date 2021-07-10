
public class QuestionTest {
	public static void main(String[] args) {
		
		// overriding test
		Question1Child objC = new Question1Child();
		objC.add(2, 3);
		
		
		// overloading test
		Question1 objP = new Question1();
		objP.add(3, 6);
		objP.add(2, 3, 5);
	}
}

