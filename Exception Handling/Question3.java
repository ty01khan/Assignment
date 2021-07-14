package ExceptionHandling;
import java.util.*;

/**
 * 
 * @author Talha Yaseen
 *
 */
public class Question3 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		List<String> empList = new ArrayList<String>();
		empList.add("Talha");
		empList.add("Abhinav");
		empList.add("Avinash");
		empList.add("Rajan");
		empList.add("Gulshan");
		empList.add("Rakesh");
		
		System.out.print("Please enter employee name: ");
		String name = inp.nextLine();
		
		try {
			int ind = empList.indexOf(name);
			if(ind == -1) {
				throw new IndexOutOfBoundsException("Exception: employee name does not exist in your data");
			}
			else {
				System.out.printf("%n%s exist in your data%n", name);
			}
		} catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.printf("%nException handled successfully%n");
		} finally {
			System.out.printf("Employees are: ");
			System.out.println(empList);
		}
		
		inp.close();
	}
}
