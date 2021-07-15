import java.util.Scanner;

/**
 * 
 * @author Talha Yaseen
 *
 *
 * Few Unchecked Exceptions are:-
 * 		ArithmeticException
 * 		ArrayIndexOutOfBoundsException
 * 		NullPointerException
 * 		IllegalArgumentException
 * 		NumberFormatException
 */
class Question2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter the array size: ");
		int size = inp.nextInt();
		int[] A = new int[size];
		
		System.out.print("Please enter the array elements: ");
		for(int i = 0; i < size; i++) {
			A[i] = inp.nextInt();
		}
		System.out.println();
		
		System.out.print("Please enter the index: ");
		int index = inp.nextInt();
		
		try {
			arrayIndex(A, index);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.printf("%nException handled successfully in the calling method%n");
		}
		
		inp.close();
		
	}
	
	static void arrayIndex(int[] A, int index) {
		if(A.length <= index) {
			throw new ArrayIndexOutOfBoundsException("Access Denied : index value out of range");
		}
		else {
			System.out.printf("Access Granted... A[%d] = %d", index, A[index]);
		}
	}
}
