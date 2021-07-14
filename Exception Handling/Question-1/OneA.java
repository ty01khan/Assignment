package ExceptionHandling;
import java.io.*;
import java.util.*;

/**
 * 
 * @author Talha Yaseen
 *
 *
 * Few Checked Exceptions are:-
 * 		FileNotFoundException
 * 		SQLException
 * 		IOException
 * 		ClassNotFoundException
 * 		InvocationTargetException
 */
class OneA {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter an age: ");
		int age = inp.nextInt();
		
		try {
			if(age < 18) {
				throw new IOException("Age you entered is not elligible to cast the vote");
			}
			else {
				System.out.println("Voted successfully... No Exception occured");
			}
		}
		catch (IOException e){
			e.printStackTrace();
			System.out.printf("%nException handled successfully in the same method%n");
		}
		
		inp.close();
	}
}

