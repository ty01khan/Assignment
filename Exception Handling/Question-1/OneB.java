import java.io.*;
import java.util.*;

/**
 * 
 * @author Talha Yaseen
 *
 */
public class OneB {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter your age: ");
		int age = inp.nextInt();
		
		try {
			checkAge(age);
		}
		catch (Exception e){
			e.printStackTrace();
			System.out.printf("%nException handled successfully in the calling method%n");
		}
		
		inp.close();
		
	}
	
	static  void checkAge(int age) throws IOException {
		if(age < 18) {
			throw new IOException("Age you entered is not elligible to cast the vote");
		}
		else {
			System.out.println("Voted successfully... No Exception occured");
		}
	}
}

