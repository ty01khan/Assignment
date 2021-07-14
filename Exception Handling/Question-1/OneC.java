package ExceptionHandling;
import java.io.*;
import java.util.*;

/**
 * 
 * @author Talha Yaseen
 *
 */
class OneC {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter an age: ");
		int age = inp.nextInt();
		
		if(age < 18) {
			throw new IOException("Age you entered is not elligible to cast the vote");
		}
		else {
			System.out.println("Voted successfully... No Exception occured");
		}
		
		inp.close();
	}
}

